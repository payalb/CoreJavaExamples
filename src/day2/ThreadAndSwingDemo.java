package day2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

class MSThread extends JFrame implements Runnable {

	JTextField tf;
	int start, stop;

	public MSThread(int start, int stop) {
		this.stop = stop;
		this.start = start;
		setLayout(new FlowLayout());
		tf = new JTextField(10);
		add(tf);
		setSize(400, 400);
		setVisible(true);

	}

	@Override
	public void run() {
		for (int i = start; i < stop; i++) {

			tf.setText("" + i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class ThreadAndSwingDemo {
	public static void main(String[] args) {
		MSThread ms1 = new MSThread(1, 40);
		MSThread ms2 = new MSThread(41, 100);
		Thread t1 = new Thread(ms1);
		Thread t2 = new Thread(ms2);
		t1.start();
		t2.start();

	}

}
