package com.class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		
		boolean creditCard=true;
		int balance=1000;
		 
		if(creditCard) {
			System.out.println("Lets check the balance");
			if(balance>1000) {
				System.out.println("pay off now");
			}else {
				System.out.println("You are safe");
			}
		}else {
			System.out.println("Do you want a credit card");
		}

	}

}
