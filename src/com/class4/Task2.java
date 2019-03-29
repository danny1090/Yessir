package com.class4;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int age;
		Scanner input=new Scanner(System.in);
		System.out.println("What is your age");	
		age=input.nextInt();
				
		if (age>=18) {
			System.out.println("You can get your driver license");
		}else {
			System.out.println("You can get your learners permit ");
		}
	}

}
