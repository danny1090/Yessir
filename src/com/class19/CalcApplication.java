package com.class19;

public class CalcApplication {

	public static void main(String[] args) {
		
		
		Calculator calc=new Calculator();
		
		
		System.out.println(calc.sum(12, 13, 17));
		System.out.println(calc.average(33, 34, 35));
		System.out.println(calc.min(32, 2, 6));
		System.out.println(calc.max(222, 56, 32));
		
		
	}

}
