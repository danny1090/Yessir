package com.class26;

public class BankTest {

	public static void main(String[] args) {
		
		Bank a=new BankA();
		System.out.println(a.getBalance());
		Bank b=new BankB();
		System.out.println(b.getBalance());
		Bank c=new BankC();
		System.out.println(c.getBalance());
	}
}
