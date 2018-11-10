package day1;

public class BoxUnBoxDemo {
	public static void main(String[] args) {

		int i = 10; // primitive type  
		Integer j = new Integer(10); // Object 
		System.out.println(i);

		System.out.println(j);
		
		// int Integer 
		// char Character  
		// float Float  
		
		// 100 % oops  -- with wrapper 
		// 90 % oops   -- with primitive types  
		
		int k = j; /// Object to primitive   --- Auto Unboxing 
		Integer p = i; // primitive to object -- Auto Boxing   
		
		int b = 10;
		byte  a = (byte) b;
		
		
		
	}

}
