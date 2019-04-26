package com.class26;

public class SuperWithConstructor {

	SuperWithConstructor() {
		System.out.println("I am a parent class constructor");
	}

	SuperWithConstructor(String str) {
		System.out.println("I am a parent class constructor with 1 String parameter");
	}
       
}

class childOfSuperWithConstructor extends SuperWithConstructor {
	childOfSuperWithConstructor() {
		super("hello");
		System.out.println("I am a child class constructor");
	}
}