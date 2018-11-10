package day1;

import java.util.HashMap;

class Emp {

	String company;

	public Emp(String company) {
		super();
		this.company = company;
	}

	@Override
	public String toString() {
		return "Emp [company=" + company + "]";
	}

}

public class HashMapDemo1 {
	public static void main(String[] args) {
        // ArrayList 
		// LinkedList 
		
		HashMap hm = new HashMap();
		// name value pairs
		Emp e1 = new Emp("IBM");
		Emp e2 = new Emp("CTS");
		Emp e3 = new Emp("Deloitte");
		Emp e4 = new Emp("TCS");

		hm.put(1, e1);
		hm.put(4, e4);
		hm.put(2, e2);
		hm.put(3, e3);

		System.out.println(hm);

	}

}
