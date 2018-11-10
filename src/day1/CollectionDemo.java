package day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {
	public static void main(String[] args) {

		// Create Read Update Delete Search Print

		int ar[] = { 1, 2, 3, 4, 5 };

		// ArrayList<Integer> al = new ArrayList<Integer>();// dynamic array
		LinkedList<Integer> al = new LinkedList<Integer>();// dynamic array

		int i = 20;
		al.add(11);//// create
		al.add(12);
		al.add(13);// auto boxing
		al.add(14);
		al.add(i);// int to Integer
		// al.add("Hello");
		// al.add('B');

		// int aa = (int) al.get(0);

		System.out.println(al.get(0));
		// Read
		System.out.println(al.get(1)); // via indexe
		System.out.println(al);

		al.set(0, 100); // Update

		System.out.println(al);
		al.remove(0); // Delete
		System.out.println(al);// Print elements

		System.out.println(al.contains(22)); // Search
		System.out.println(al.contains(12));

		//

		// All collections classes work with Objects not primitives types

		System.out.println(al);
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {

			// Object next = iterator.next();
			Integer next = (Integer) iterator.next();
			System.out.println(++next);
			;

			// System.out.println(iterator.next());
		}
		System.out.println("---------------");
		Iterator<Integer> descendingIterator = al.descendingIterator();

		while (descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}

	}



}
