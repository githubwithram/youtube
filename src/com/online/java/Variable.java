package com.online.java;

public class Variable {
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		Variable v1 = new Variable();
		v1.y = 888;
		x = 999;
		Variable v2 = new Variable();
		System.out.println(x + "" + v2.y);

	}

}
