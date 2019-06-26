package com.class29;

public interface takeScreenshot {

	String fileExtension=".png";//by default it is public static final and MUST be INITIALIZED
	
	void takeScreenshot();
	//from java 8 we can have defined methods in  an interface
	static void m1() {
		System.out.println("Static m1 method");
	}
	default void m2() {
		System.out.println("Default m2 method");
	}
}
