package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		//System.out.println(a/b);//new ArithmeticException
		//if person is >18 you --> issue dr license else --> throw an exception
		//checkAgeEligibility(17);
		withdraw(2000, 15000);
	}
	public static void checkAgeEligibility(int age) {
		if(age>=18) {
			System.out.println("Congradulations on your driver license");
		}else {
			throw new ArithmeticException("You are not eligble to get driver license");
		}
	}
	public static void twoNumDiv(int a, int b) {
		if(b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("We cannot divide by zero");
		}
	}
	public static void checkUserNameLength(String username) {
		if(username.length()>=3) {
			System.out.println("Username is accepted");
		}else {
			throw new NullPointerException("Username must be longer than 3 characters");
		}
	}
	// create an exception: when user it trying to withdraw larger amount that the balance
    //throw an exception saying “You do not have enough money”
	
	public static void withdraw(int withdraw, int balance) {
		if(withdraw>balance) {
			System.out.println("You have enough money");
		}else {
			throw new ArithmeticException("You do not have enough money");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
