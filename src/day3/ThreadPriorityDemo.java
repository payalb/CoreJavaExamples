package day3;

class MyTh extends Thread {
	MyTh() {
	}

	@Override
	public void run() {
		for (int i = 0; i < 40; i++) {
			System.out.println(i + "  " + Thread.currentThread().getName());
			// try {
			// Thread.sleep(500);
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }

		}
	}
}

public class ThreadPriorityDemo {
	public static void main(String[] args) {

		MyTh th1 = new MyTh();
		MyTh th2 = new MyTh();
		th1.setName(" T1 ");
		th2.setName(" T2 ");
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);

		th1.start();
		th2.start();

	}

}
