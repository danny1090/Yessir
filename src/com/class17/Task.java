package com.class17;

public class Task {

	void hello(int a, int b) {
		if(a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
	}
	public static void main(String [] args) {
		Task obj=new  Task();
		obj.hello(2, 8);
	}
	
}
