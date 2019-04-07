package com.class19;

public class Human {
	
	
	static String eyeColor= "brown"; //Static variable make change for everyone
	
	
	
	int height=6;
	int weight=180;
	String gender="Male";
	String programmingLanguage="Java";// Instance Variable

	void speak() {
		String language="English"; //Local variable only available in "speak" method
		
		System.out.println("Humans can speak"+language);
	}
	
	void coding() {
		
		System.out.println("Syntax students can code"+programmingLanguage);//Instance Variable
	}
	
	void print() {
		System.out.println(eyeColor);
	}
}
