package day1;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListAsStackDemo {
	public static void main(String[] args) {
		// LIFO

		LinkedList ll = new LinkedList();

		ll.push(20);
		ll.push(30);
		ll.push(11);

		System.out.println(ll);
		System.out.println(ll.pop());
		;
		System.out.println(ll.pop());
		;

	}

}
