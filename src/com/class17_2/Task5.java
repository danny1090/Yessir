package com.class17_2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Task5 obj=new Task5();
		obj.numbers();
	}
	void numbers() {
		Scanner scan = new Scanner(System.in);
		int secret, userNumber;

		secret = 7;

		do {
			System.out.println("Please enter any number from 1-20 ");
			userNumber = scan.nextInt();

			if (userNumber < secret) {
				System.out.println("Number is too small");
			} else if (userNumber > secret) {
				System.out.println("Number is too large");
			} else {

			}

		} while (secret != userNumber);

		System.out.println("Congratulations! You got it!");
	}
}
