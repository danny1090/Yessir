package com.class15;

public class IQ1 {

	public static void main(String[] args) {
		// TWrite program to to swap 2 numbers without a temporary variable?
		//Swap 2 Strings without a temporary variable
		//SIMPLE ARITHMETIC OPERATIONS
		
		
		int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("The value of a = "+a+" the value of b = "+b);
		
		String str1="Hello";
		String str2="World";
		
		str1=str1+str2;//HelloWorld-->10
		str2=str1.substring(0, str1.length()-str2.length());//Hello
		str1=str1.substring(str2.length());
		System.out.println("The value of str1 is = "+str1+"The value of str2 is = "+str2);
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
