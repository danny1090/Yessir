package com.class4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		int loan= 2000000;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What is the ammount of loan needed ");
		loan=sc.nextInt();
		
		if (loan<200000) {
		    System.out.println("We will lend you the money");
		}else {
			System.out.println("We will not lend you the money");
		}
		
		Scanner input =new Scanner(System.in);
		
		
		
	}

}
