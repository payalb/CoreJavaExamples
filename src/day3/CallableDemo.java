package day3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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

			Thread.sleep(5000);

		}
		return sum;
	}

}

public class CallableDemo {
	public static void main(String[] args) {
		MyCallable mc1 = new MyCallable(1, 2); // Runnable TASK NOT THREAD
		MyCallable mc2 = new MyCallable(2, 3); // Runnable Task
		Integer result1 = null;

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);// Create Thread Pool
		Future<Integer> submit = newFixedThreadPool.submit(mc1); // LIKE START
		try {
			System.out.println("Before get...");
			result1 = submit.get();// Blocking Call
			System.out.println("After Get ");
			// System.out.println("GOT " + result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		submit = newFixedThreadPool.submit(mc2); // LIKE START
		Integer result2 = null;
		try {
			System.out.println("Before get...");
			result2 = submit.get();// Blocking Call
			System.out.println("After Get ");
			// System.out.println("GOT " + result2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sum is " + (result1 + result2));

		newFixedThreadPool.shutdown();// Graceful closing 

		System.out.println("DONE");

	}

}
