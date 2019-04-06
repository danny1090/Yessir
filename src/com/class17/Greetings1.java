package com.class17;

public class Greetings1 {
	public static void main(String [] args) {
		
		Greetings1 obj=new Greetings1();
		obj.askHowAreYou("Danny");
		String day=obj.whatIsADay();
		System.out.println("Today is "+day);
		
	}
	//void is a return type, askHowAreYou-method name
	void askHowAreYou(String name) {
		System.out.println("How are you "+name);
	}
	void askHowAreYou1(String name) {
		System.out.println("How are you "+name);
	}
	void askHowAreYou2(String name) {
		System.out.println("How are you "+name);
	}
	void askHowAreYou3(String name) {
		System.out.println("How are you "+name);
	}
	
	
	
	
	String whatIsADay() {//New Method(String)   <----
		System.out.println("I am inside a method");
		return"Thursday";
	}
	
	
	
}
