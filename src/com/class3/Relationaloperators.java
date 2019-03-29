package com.class3;

public class Relationaloperators {

	public static void main(String[] args) {
		
		int a=19;
		int b=5;
		
		boolean result=a>b;
		boolean result1=a==b;
		System.out.println(result);
		System.out.println(result1);
		
		//compare 2 numbers and if a is larger than b --> print
		
		if (a>b) {
			System.out.println("a is larger than b");
		} else {
			System.out.println("b is larger than a");
		}
		
		//declare price and if price is higher than expected
		
		double shoesPrice=59.99;
		double allowedPrice=31.99;
		
		if(shoesPrice <= allowedPrice) {
		   System.out.println("I am buying those shoes");
		}else {
			System.out.println("I am not buying those shoes");
		}
	
        System.out.println("I am continues code");
        
	}   
}
