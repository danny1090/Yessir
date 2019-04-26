package com.class26;

public class ThisWithConstructor {
	//this() calls the current class constructor --> 
	ThisWithConstructor(){
		System.out.println("I am inside constructor with no parameters");
		System.out.println("I have no parameter");
	}
	
	ThisWithConstructor(String str){
		this();
		System.out.println("I am inside constructor with 1 parameter");
		System.out.println("I have 1 String parameter "+str);
	}
	
	ThisWithConstructor(String str1, String str2){
		this(str1);
		System.out.println("I am inside constructor with 2 parameters");
		System.out.println("I have 2 String parameters "+str1+" "+str2);
		
	}
	public static void main(String [] args) {
//		ThisWithConstructor obj=new ThisWithConstructor();
//		ThisWithConstructor obj1=new ThisWithConstructor("Hello");
		
		ThisWithConstructor obj2=new ThisWithConstructor("Hello", "Bye");
		//1. I am inside construcotr with no parameters
		//2. I have no parameters
		//3. I am inside constructor with 1 parameter
		//4. I am string constructor
	}
}
