package com.class17_2;

public class SquarePattern {

	public static void main(String[] args) {

		SquarePattern pattern=new SquarePattern();
		pattern.printPattern();

	}

	void printPattern() {
		for (int i = 1; i <= 4; i++) {

			for (int y = 1; y <= 6; y++) {

				if (i == 1 || i == 4 || y == 1 || y == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
