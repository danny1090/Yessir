package com.class6;
import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Program to find largest number among three numbers using nested if
		 * 
		 */
		
		int num1, num2, num3, largest;
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter three distinct double values");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		
		if(num1>num2) {
			if(num1>num3) {
				largest=num1;
			}else {
				largest=num3;
			}
		}else { //assuming num2>num1
			
			if(num2>num3) {
				largest=num2;
			}else {
				largest=num3;
			}
		}
		System.out.println(largest+" is the largest");
	}

}
