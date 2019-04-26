package com.class28;

public interface Bank {
	String name="Bank";
	String hello="hi";
	//only abstract methods in interface
	//by default compiler adds public and abstract to every method
	void hasChecking();
	void hasSavings();
	void hasCrditCard();
	
	//static void hasLoan(); cannot have static abstract
}
class BOA implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checkings acoounts");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 savings account");
		
	}

	@Override
	public void hasCrditCard() {
		System.out.println("BOA has 10 different credit cards");
		
	}
}
class PNC implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checkings acoounts");
	}
	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 savings account");
	}
	@Override
	public void hasCrditCard() {
		System.out.println("PNC has 4 credit cards");
	}
	public void hasLoan() {
		System.out.println("");
	}
	
}