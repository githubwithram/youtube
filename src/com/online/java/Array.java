package com.online.java;

public class Array {

	public static void main(String[] args) {

		int x = (10 < 20) ? 30 : ((40 < 50) ? 60 : 70);
		System.out.println(x);

		int x1 = 8;
		int y = --x1; // pre decrement x=7 y=8
		System.out.println("Value of y: " + x1);
		
		int z = x1--; // post decrement x=8 z=8
		System.out.println("Value of y: " + x1);
		int f = ++x1; // pre increment x=9 f=8
		System.out.println("Value of y: " + x1);
		int g = x1++; // post increment x=10 g=8
		System.out.println("Value of y: " + y);
		System.out.println("Value of y: " + z);
		System.out.println("Value of f: " + f);
		System.out.println("Value of g: " + g);
		System.out.println("Value of g: " + x1);
		
		/*
		 * 
		 * 
		 * int[] x = new int[5]; String y = "Ramsekhar";
		 * 
		 * 
		 * int[] a; // Array declaration int[] a1 = new int[3]; // Array Initialization
		 * a1[0] = 10; a1[1] = 20; a1[2] = 30;
		 * 
		 * System.out.println(a1[2]);
		 * 
		 * 
		 * System.out.println(c); System.out.println(x); System.out.println(x.length);
		 * System.out.println(y.length()); // System.out.println(s[2].length());
		 * System.out.println("Hello World"); System.out.println("Hi kishore");
		 */

	}

}
/*
 * Array is out of bound exception is come when we use more than set values
 */
