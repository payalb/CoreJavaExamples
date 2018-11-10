package day2;

class Queue  {

	int data;

	boolean flag = false;

	synchronized public int getData() {

		if (flag == false) { // this should be true for first time  
			try {
				wait(); // Release the lock and go to waiting 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		flag = false;
		notify(); // will wake up those threads which have gone to wait because of wait call

		return data; // all logic should be done before  
	}

	public void setData(int data) { // Pro

		if (flag == true)// this should become  false for first time
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		this.data = data;// by the time you reach here for first time
		flag = true; // consumer class is now in waiting
		notify();// wake up consumer

	}

}

class Producer extends Thread {
	Queue q;

	public Producer(Queue q) {
		super();
		this.q = q;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			System.out.println("Stored " + i);
			q.setData(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

} // puts data

class Consumer extends Thread {
	Queue q;

	public Consumer(Queue q) {
		super();
		this.q = q;
	}

	@Override
	public void run() {
		while (true) {

			int data = q.getData();
			System.out.println("Got    " + data);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

} // gets data

public class WaitNotifyDemo {

	public static void main(String[] args) {

		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();

	}

}
