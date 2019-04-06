package com.class17_2;

import java.util.Scanner;

public class TaskLeapYear {

	public static void main(String[] args) {
		
		int year;
		Scanner scan=new Scanner(System.in);
		
		for(int a=1; a<10; a++) {
			System.out.println("Please enter a guessed leap year");
			year=scan.nextInt();
			
			if(year%400 == 0) {
				System.out.println(year + " is a leap year ");
			}else if (year%4==0 && year%100!=0) {
				System.out.println( year + " is a leap year ");
				break;
			}else {
				System.out.println("Year is NOT a leap year");
			}
		}
	}
}
