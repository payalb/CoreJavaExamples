package day2;

class MyThread extends Thread // create thread
{

	void f() {
		System.out.println("Hello");
	}

	@Override
	public void run() {
		// System.out.println("Hai");
		for (int i = 1; i < 400; i++) {
			//System.out.println(i);
			System.out.println(i + "  " + Thread.currentThread().getName());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

public class ThreadFromExtendingThread {

	public static void main(String[] args) {

		MyThread mt = new MyThread(); // create instance of thread
		mt.start();// start the thread

		for (int i = 400; i < 1000; i++) {
			//System.out.println(i);
			System.out.println(i + "   " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("DONE");

	}

}
