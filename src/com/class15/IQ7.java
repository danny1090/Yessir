package com.class15;

import java.util.Scanner;

public class IQ7 {

	public static void main(String[] args) {
		// Write a Java program to check whether a given number is prime or not
		//Should meet 2 conditions: divisible by 1 and byItself only!
		//2,3,5,7,11,13,17,19,23,29
		int number;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number to check if it is prime");
		number=scan.nextInt();
		boolean prime= true; 
		
		for(int i=2; i < number; i++) {
			if(number % i !=0 ) {				
		}
			else {
				prime=false;
			}
		}
		System.out.println(prime);	
		
		
		int num;
		System.out.println("Enter number to check if it is prime or not");
		num=scan.nextInt();
		boolean yuh= true;
		
		for(int j=2; j<num; j++) {
			if(num%j!=0) {
			}
			else {
				yuh=false;
				
			}
			
		}
		System.out.println(yuh);
		
		int hello;
		System.out.println("Enter number you think is prime yo");
		hello=scan.nextInt();
		boolean primer=true;
		
		for(int a=2; a<hello; a++) {
			if(hello%a!=0) {	
			}
			else {
				primer=false;
			}
		}
		System.out.println(primer);
		
		
		
		int digit;
		System.out.println("Check if number is prime");
		digit=scan.nextInt();
		boolean yeah=true;
		
		for(int b=2; b<digit; b++) {
			if(digit%b!=0) {	
			}
			else {
				yeah=false;
			}
		}
		System.out.println(yeah);
		
		int muneca;
		System.out.println("PRIME MUNECA?");
		muneca=scan.nextInt();
		boolean alexis=true;
		
		for(int d=2; d<muneca; d++) {
			if(muneca%d!=0) {				
			}
			else {
				alexis=false;
			}
		}
		System.out.println(alexis);
		
		
		int coco;
		System.out.println("Prime coco chets");
		coco=scan.nextInt();
		boolean danny=true;
		
		for(int p=2; p<coco; p++) {
			if(coco%p!=0) {		
			}
			else {
				danny=false;
			}
		}
		System.out.println(danny);
		
		
		int bitch;
		System.out.println("ENter prime number bitch");
		bitch=scan.nextInt();
		boolean fag=true;
		
		for(int x=2; x<bitch; x++) {
			if(bitch%x!=0) {
			}
			else {
				fag=false;
			}
		}
		System.out.println("Output is "+fag);
		
		
		
		
	}

}
