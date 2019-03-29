package com.class8;

public class Sum {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=5;i++) { 
			
			sum=sum+i;
		}
		System.out.println(sum);//6, 5, 15, 7, 1
		
		//find sum of all even numbers from 1 to 100+
		
		int scum=0;
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
			   sum=sum+i;	  
			}
			System.out.println(sum);
		}
	
	
	
	
	
	}
}
