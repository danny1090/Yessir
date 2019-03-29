package com.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
			if(i==2 || i==3) {
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("I am outside of foor loop");
	
		for(int a=1; a<=20; a++) {
			
			if(a%3==0) {
				continue;
			}
			System.out.println(a);
			
		for(int b=1; a<=30;a++)	{
			if(a%4==0) {
				continue;
			}
			System.out.println(a);
		}
			
			
			
			
			
			
		}
		
	}
}
