package com.class17_2;

public class NestedLoops {

	public static void main(String[] args) {

		// for( i=0; i<=5;i++)
		// System.out.println(i);

		// I want to print pattern 12345 5x

		NestedLoops loop = new NestedLoops();
		loop.printLoop();
		loop.printPattern();
		

		
	}
	
	void printLoop() {
		for (int i = 1; i <= 3; i++) { // outer loop is rows

			for (int y = 1; y <= 9; y++) { // inner loop is columns

				System.out.print(y);
			}
			System.out.println();
		}

	}

	void printPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int y = 1; y <= i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
