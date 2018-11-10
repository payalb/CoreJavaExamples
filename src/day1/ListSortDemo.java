package day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListSortDemo {
	public static void main(String[] args) {

		// LinkedList<Integer> al = new LinkedList<Integer>();// dynamic array
		ArrayList<Integer> al = new ArrayList<Integer>();// dynamic array

		al.add(11);//// create
		al.add(13);// auto boxing
		al.add(12);
		al.add(9);
		al.add(14);

		System.out.println(al);
		al.sort(null);
		System.out.println(al);

	}

}
