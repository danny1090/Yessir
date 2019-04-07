package com.class19;

public class StaticTest {

	static int a = 10; //static <----

	public static void main(String[] args) {
		StaticTest obj1 = new StaticTest();

		obj1.a = 15;

		System.out.println(obj1.a);

		StaticTest obj2 = new StaticTest();

		System.out.println(obj2.a);
	}

}
