package day2;

class AddThread extends Thread {
	int begin, end;
	int sum1, sum2;

	public AddThread(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	@Override
	public void run() {
		for (int i = begin; i <= end; i++) {
			// System.out.println(i);

			if (Thread.currentThread().getName().equals("Thread-0"))
				sum1 = sum1 + i;
			if (Thread.currentThread().getName().equals("Thread-1"))
				sum2 = sum2 + i;

		}
	}

}

public class AddNumbersWithThreadDemo {
	public static void main(String[] args) {

		AddThread adt1 = new AddThread(1, 10);
		AddThread adt2 = new AddThread(11, 21);

		adt1.start();
		adt2.start();
		 System.out.println("Waiting for computation ....");
		try {
			adt1.join();
			adt2.join(); // wait for me to join you 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(adt1.sum1 + adt2.sum2);

	}

}
