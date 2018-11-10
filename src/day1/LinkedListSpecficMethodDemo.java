package day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSpecficMethodDemo {
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
		System.out.println(al.size());
		Integer poll = al.poll();
		System.out.println(poll);
		poll = al.poll();
		System.out.println(poll);
		System.out.println(al.size());
		System.out.println(al.peek());
		System.out.println(al.size());
		al.addFirst(99);
		System.out.println(al);

	}

}
