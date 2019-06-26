package com.class32;

public abstract class CreditCard {

	public String creditCardName;
	
	public CreditCard(String creditCardName) {
		this.creditCardName=creditCardName;
	}
	public void openAccount() {
		System.out.println("Open "+creditCardName+"credit card");
	}
	public abstract void interestRate();
	public abstract void annualFee();
}
class Visa extends CreditCard{

	public Visa(String creditCardName) {
		super(creditCardName);
	}
	public void interestRate() {
		System.out.println(creditCardName+"card has interest rate of 22%");
		
	}
	public void annualFee() {
		System.out.println(creditCardName+"has annual fee of $200");
	}
}
class AX extends CreditCard{

	public AX(String creditCardName) {
		super(creditCardName);
	}
	public void interestRate() {
		System.out.println(creditCardName+"card has interest rate of 25%");
		
	}
	public void annualFee() {
		System.out.println(creditCardName+"has NO annual fee");
	}
}
class MasterCard extends CreditCard{

	public MasterCard(String creditCardName) {
		super(creditCardName);
	}
	public void interestRate() {
		System.out.println(creditCardName+"card has interest rate of 20%");
		
	}
	public void annualFee() {
		System.out.println(creditCardName+"has annual fee of $150");
	}
}


