package com.class24;

public class Test {

	public int test() {
		System.out.println("I am a public method");
		return 5;
	}
	protected void test(String str) {
		System.out.println("I am a protected method");
	}
	void test(String str, int num) {
		System.out.println("I am a default method");
	}
	private void test(int num) {
		System.out.println("I am a private method");
	}
}
