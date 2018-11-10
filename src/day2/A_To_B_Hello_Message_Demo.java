package day2;

class A {
	B b = null;

	A() {
		// B b = new B();
		// b.f("Hello");
	}

	public void setB(B b) {
		this.b = b;

	}

	void call() {
		b.f("Hello");
	}
}

class B {
	void f(String s) {
		System.out.println("GOT " + s);
	}
}

public class A_To_B_Hello_Message_Demo {
	public static void main(String[] args) {

		B b = new B();
		A a = new A();
		a.setB(b);
		a.call();
	}

}
