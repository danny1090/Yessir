package com.class25;

public class FinalKeyword {

	public static final String name="Syntax";
	
	public static void main(String[] args) {
		
		//Final Keyword can be used in three places
		//1. final variables - we cannot change their values --> CONSTANT
		//2. Methods - we CANNOT override final methods
		//3. Classes - we CANNOT create a child of a Final CKASS --> prevent inheritance
		
		//final String str="Hello";
		//str="John";
		//name="School";
		
		
		
	}

}
class ChildOfFinal extends FinalKeyword{
	//CANNOT OVERRIDE FINAL METHOD
	//public 
}