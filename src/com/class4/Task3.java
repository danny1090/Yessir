package com.class4;

public class Task3 {

	public static void main(String[] args) {
		
		double mortgageRate=4.8;
		
		int mortgagePrice=200000;
		
		if (mortgageRate>4.5) {
			System.out.println("I am not buying the house");
		}else {
			System.out.println("I will consider buying the house");
			if(mortgagePrice > 200000) {
				System.out.println("I will take a loan");
			}else {
				System.out.println("I will pay cash");
			}
			
		
		
		}
	}
		
}
