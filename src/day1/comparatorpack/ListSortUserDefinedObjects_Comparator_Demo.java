package day1.comparatorpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

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

}

class LComparator implements Comparator<Box> {

	@Override
	public int compare(Box o1, Box o2) {
		if (o1.l > o2.l)
			return 1;
		if (o1.l < o2.l)
			return -1;
		return 0;

	}

}

class BComparator implements Comparator<Box> {

	@Override
	public int compare(Box o1, Box o2) {
		if (o1.b > o2.b)
			return 1;
		if (o1.b < o2.b)
			return -1;
		return 0;

	}

}

public class ListSortUserDefinedObjects_Comparator_Demo {
	public static void main(String[] args) {

		// LinkedList<Integer> al = new LinkedList<Integer>();// dynamic array
		ArrayList<Box> al = new ArrayList<Box>();// dynamic array
		Box b1 = new Box(3, 5);
		Box b2 = new Box(6, 3);
		Box b3 = new Box(1, 9);
		Box b4 = new Box(7, 2);

		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);

		System.out.println(al);
		Collections.sort(al, new LComparator());
		System.out.println(al);

	}

}
