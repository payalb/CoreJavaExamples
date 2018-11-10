package day1.userdefined_in_treepack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

class Box implements Comparable<Box> {
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

	// @Override
	// public int compareTo(Box o) { // Length rule
	// if (l > o.l)
	// return 1;
	// if (l < o.l)
	// return -1;
	// return 0;
	//
	// }
	@Override
	public int compareTo(Box o) { // Length rule
		if (b > o.b)
			return 1;
		if (b < o.b)
			return -1;
		return 0;

	}

}

public class TreeSetUserDefinedObjects {
	public static void main(String[] args) {

		// LinkedList<Integer> al = new LinkedList<Integer>();// dynamic array
		TreeSet<Box> al = new TreeSet<Box>();// dynamic array
		Box b1 = new Box(3, 5);
		Box b2 = new Box(6, 3);
		Box b3 = new Box(1, 9);
		Box b4 = new Box(7, 2);

		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		System.out.println(al.size());

		System.out.println(al);

		// System.out.println(al);

	}

}
