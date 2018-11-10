package day3.userkey;

import java.util.HashMap;

class MyKey
{
  int a;
  

}

class Book{

	
}
class Emp {

	String company;
	Book b;

	public Emp(String company) {
		super();
		this.company = company;
	}

	@Override
	public String toString() {
		return "Emp [company=" + company + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		return true;
	}

	

	

}

public class HashMapWithUserKey {
	public static void main(String[] args) {
		// ArrayList
		// LinkedList

		HashMap hm = new HashMap(); // Hash + Map
									// Hash -- Using Hashing alog
									// Map -- Name Value Pair
									// HashSet

		// name value pairs
		Emp e1 = new Emp("IBM"); // every new will allocate new memory location
		Emp e2 = new Emp("CTS");
		Emp e3 = new Emp("Deloitte");
		Emp e4 = new Emp("TCS");

		hm.put("ad", e1);// Name value pairs Map content is the data for Map
		hm.put("ab", e2);
		hm.put("be", e4);
		hm.put("df", e3);

		boolean containsValue = hm.containsValue(new Emp("TCS"));
		System.out.println(containsValue);

		System.out.println("has Key ad " + hm.containsKey("ad"));
		;

		System.out.println(hm);
		// Hash is to make search Faster
		// What you store in Hash Is Data

	}

}
