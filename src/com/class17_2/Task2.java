package com.class17_2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Task2 obj=new Task2();
		obj.shopping();
	}

	void shopping() {
		Scanner scan = new Scanner(System.in);
		String item;
		double price;
		double payment;
		double totalPayment = 0;
		double balance;
		double change;

		System.out.println("Please enter item ");
		item = scan.nextLine();

		System.out.println("Please enter item price ");
		price = scan.nextDouble();

		do {
			System.out.println("Please enter your payment amount");
			payment = scan.nextDouble();

			totalPayment = totalPayment + payment;

			balance = price - totalPayment;

			if (totalPayment > price) {
				change = totalPayment - price;
				System.out.println("Please take your change " + change);
				break;
			} else if (totalPayment < price) {
				balance = price - totalPayment;
				System.out.println("Please enter more $" + balance);
			} else {
				System.out.println("Thank you for shopping! ");
			}

		} while (totalPayment != price);

	}

}
