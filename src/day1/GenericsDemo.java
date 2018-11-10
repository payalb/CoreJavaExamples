package day1;

class A<T> {

	T a;

	void f(T a) {

		System.out.println(a);

	}

}

public class GenericsDemo {
	public static void main(String[] args) {

		A<Integer> o1 = new A<Integer>();
		o1.f(9);

		A<Character> oc = new A<Character>();
		oc.f('A');

	}

}
