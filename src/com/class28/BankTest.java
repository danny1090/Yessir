package com.class28;

public class BankTest {

	public static void main(String [] args) {
		Bank bank=new BOA();
		bank.hasChecking();
		bank.hasCrditCard();
		bank.hasSavings();
		System.out.println(bank.hello);
		Bank bank1=new PNC();
		
	}
	
}
