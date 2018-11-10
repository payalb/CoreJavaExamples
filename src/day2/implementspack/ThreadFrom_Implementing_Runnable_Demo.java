package day2.implementspack;

class MyThread implements Runnable // create thread
{

	void f() {
		System.out.println("Hello");
	}

	@Override
	public void run() {
		// System.out.println("Hai");
		for (int i = 20; i < 30; i++) {
			// System.out.println(i);
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

public class ThreadFrom_Implementing_Runnable_Demo {

	public static void main(String[] args) {

		MyThread mt = new MyThread(); // create instance of thread
		Thread t = new Thread(mt);
		t.start();// start the thread

		for (int i = 1; i < 10; i++) {
			// System.out.println(i);
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
