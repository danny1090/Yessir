package com.class7;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		
		int a=10;
		
		do {//executes first and then checks it
			System.out.println("Hello");
			a++;
			
		}while(a<15);
		//----------------------------------------------------
		
		int b=10;
		
		while(b>15) {//check conditon and then execute
			System.out.println("Bye");
			b++;
		}
	}

}
