package com.class23;

public class Employee {
	
	public static String department="IT";
	int salary;//default
	protected int salary1;//protected

	public void getPaid() {
		System.out.println("Employee gets paid " + salary);
	}
	static void work() {
		System.out.println("Employee works in "+department+" department");
	}
	protected void checkMethod() {
		System.out.println("Checking method protected");
	}
	void checkMethod1() {
		System.out.println("Checking method default");
	}
}
