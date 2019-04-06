package com.class17_2;

public class Task3 {

	public static void main(String[] args) {
		Task3 obj=new Task3();
		obj.print();
		
	}
	void print() {
		for (int a = 1; a <= 5; a++) {

			for (int b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
