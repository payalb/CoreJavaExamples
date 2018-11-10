package day1.hashpack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

class Box {
	int l, b;

	public Box(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Box [l=" + l + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + b;
		result = prime * result + l;
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
		Box other = (Box) obj;
		if (b != other.b)
			return false;
		if (l != other.l)
			return false;
		return true;
	}
	

}

public class HashSetDemo1 {
	public static void main(String[] args) {

		HashSet hs = new HashSet();

		Box b1 = new Box(3, 5);
		Box b2 = new Box(6, 3);
		Box b3 = new Box(3, 5);
		// Box b4 = new Box(7, 2);
		hs.add(b1);
		hs.add(b2);
		System.out.println(hs.contains(b3));
		System.out.println(hs.size());

		// System.out.println(al);

	}

}
