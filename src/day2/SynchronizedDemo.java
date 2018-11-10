package day2;

class PrintTable {

	synchronized public void print(int data) {
		for (int i = 1; i <= 10; i++) {

			System.out.println(data + " *  " + i + " = " + (data * i));

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

class PrintThread extends Thread {

	PrintTable pt;
	int data;

	public PrintThread(PrintTable pt, int data) {
		super();
		this.pt = pt;
		this.data = data;
	}

	@Override
	public void run() {
		pt.print(data);
	}

}

public class SynchronizedDemo {

	public static void main(String[] args) {

		PrintTable pt = new PrintTable();
		PrintThread pth1 = new PrintThread(pt, 4);
		PrintThread pth2 = new PrintThread(pt, 5);

		pth2.start();
		pth1.start();

	}

}
