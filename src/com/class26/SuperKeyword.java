package com.class26;

public class SuperKeyword {

	String name = "John";

	public void sayName() {
		System.out.println("My name is " + name);

	}
}

class childOfSuperKeyword extends SuperKeyword {
	String myName = "Michael";

	public void sayName() {
		System.out.println("Parent name is "+super.name);
		System.out.println("Child name is " + myName);
	}
	public void callingMethods() {
		sayName();//this.sayName();
		super.sayName(); 
	}
}