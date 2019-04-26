package com.class24;

public class Bank {
//Parent Class
	public int chargeInterest() {
		return 0;
	}
}

//1 Child Class
class BOA extends Bank {
	@Override//annotation
	public int chargeInterest() {
		return 2;
	}
}
//2 Child class
class PNC extends Bank {
	@Override
	public int chargeInterest() {
		return 3;
	}
}
