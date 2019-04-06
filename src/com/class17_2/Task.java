package com.class17_2;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Task sum=new Task();
		sum.sumOf();
		

	}

	void sumOf() {
		Scanner scan = new Scanner(System.in);
		int startPoint;
		int endPoint;
		int sumofEven = 0;
		int sumofOdd = 0;

		System.out.println("Please enter start point: ");
		startPoint = scan.nextInt();

		System.out.println("Please enter end point: ");
		endPoint = scan.nextInt();

		if (startPoint < endPoint) {
			for (int a = startPoint; a <= endPoint; a++) {
				if (a % 2 == 0) {
					sumofEven += a;
				} else {
					sumofOdd += a;
				}

			}
			System.out.println("Your sum of even numbers are: " + sumofEven);
			System.out.println("Your sum of odd numbers are: " + sumofOdd);
		}
	}
}
