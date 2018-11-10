package day3;

class MyNumber {
	int a;

	public MyNumber(int a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "MyNumber [a=" + a + "]";
	}

	MyNumber greater(MyNumber mnx) { // what is the return type
		if (mnx.a > a)
			return mnx;
		return this;

	}

	MyNumber greater(MyNumber mnx, MyNumber mny) { // what is the return type
		if (mnx.a > mny.a)
			return mnx;
		return mny;

	}
}

public class ThisDemo {
	public static void main(String[] args) {

		MyNumber mn1 = new MyNumber(10);
		MyNumber mn2 = new MyNumber(20);
		System.out.println(mn2);

		MyNumber mn3 = mn1.greater(mn2); // mn3 is filled with mn1 or mn2
		System.out.println(mn3);

	}

}
