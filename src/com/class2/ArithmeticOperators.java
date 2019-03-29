package com.class2;

public class ArithmeticOperators {
	
	public static void main (String[] args) {
		//declare 2 int variables and then we perform:
		//addition, subtraction, multiplication, division
		
		int a=30;
		int b=15;
		
		System.out.println(a+b);  //45
		System.out.println(a-b);  //15
		System.out.println(a*b);  //450
		System.out.println(a/b);  //2
		
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		
		System.out.println(sum);  //45
		System.out.println(sub);  //15
		System.out.println(mult); //450
		System.out.println(div);  //2
		
		System.out.println("The sum of a and b is " +sum);
		System.out.println("The difference of a and b is " +sub);
		System.out.println("The composition of a and b is "+mult);
		System.out.println("The ratio of a and b is "+div);
		
		
	}

}
