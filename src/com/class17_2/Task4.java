package com.class17_2;

public class Task4 {

	public static void main(String[] args) {
		Task4 obj=new Task4();
		obj.printPattern();
		
		
		

	}
	void printPattern() {
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=5; a>0;a--) {
			for(int b=0; b<a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
