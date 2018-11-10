package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add(8);// not thread safe
		List als = Collections.synchronizedList(al);
		als.add(9);// thread safe  
		
		
		
		
	}

}
