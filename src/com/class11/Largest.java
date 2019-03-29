package com.class11;

public class Largest {

	public static void main(String[] args) {
		// Create an array of integers and find largest number 
		//INTERVIEW QUESTION
		
		
		int [] numbers= {10, 12, 18, 22, 26, 31, 1000};
		int large=0;
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]>large) {
				large=numbers[i];
			}
		}
		System.out.println(large);
		
		int [] num= {122,134,674,8743,8};
		int biggest=num [0];
		
		for (int i=0; i<num.length;i++) {
			if(num[i]>biggest) {
				biggest=num[i];
			}
		}
		System.out.println(biggest);
		
		
	
	}
}
