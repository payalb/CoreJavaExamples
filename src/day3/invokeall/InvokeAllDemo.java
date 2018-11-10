package day3.invokeall;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.swing.plaf.synth.SynthSeparatorUI;

class MyCallable implements Callable<Integer> {
	int st, sp;
	public MyCallable(int st, int sp) {
		this.st = st;
		this.sp = sp;
	}
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = st; i <= sp; i++) {
			sum = sum + i;
			System.out.println(" "+Thread.currentThread().getName());
			Thread.sleep(500);
		}
		return sum;
	}
}

public class InvokeAllDemo {
	public static void main(String[] args) {
		MyCallable mc1 = new MyCallable(1, 2); // Runnable TASK NOT THREAD
		MyCallable mc2 = new MyCallable(2, 3); // Runnable Task
		MyCallable mc3 = new MyCallable(5, 10); 
		ArrayList<Callable<Integer>> aloc = new ArrayList<Callable<Integer>>();
		aloc.add(mc1);
		aloc.add(mc2);
		aloc.add(mc3);
		Integer result1 = null;
		int sum = 0;
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);// Create Thread Pool
		try {
			List<Future<Integer>> invokeAll = newFixedThreadPool.invokeAll(aloc);
			for (Future<Integer> future : invokeAll) {
				try {
					Integer res = future.get();
					sum = sum + res;
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Final Result is " + sum);
		newFixedThreadPool.shutdown();// Graceful closing

		System.out.println("DONE");

	}

}
