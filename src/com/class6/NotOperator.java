package com.class6;

public class NotOperator {

	public static void main(String[] args) {
		/*
		 * not operator !
		 */
		boolean a=!true;
		
		System.out.println("The value of boolean variable is "+a);
		
		boolean snow=true;
		
		//if it is not snowing--> I will come to the class otherwise i will stay home
		
		if(!snow) {
			System.out.println("I will come to class");
		}
		int x=10;
		int y=20;
		
		if(!(x>y)){
			System.out.println("Hello");
		}
		
	}

}
