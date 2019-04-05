package com.class17;

public class Task2 {
	
	void evenOrOdd(int a) {
		if(a%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	
	}
	public static void main(String [] args) {
		
		Task2 obj=new Task2();
		obj.evenOrOdd(4);
	}
	
	
	
	
}
