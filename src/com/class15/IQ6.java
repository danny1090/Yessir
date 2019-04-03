package com.class15;

import java.util.Scanner;

public class IQ6 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a string is palindrome or not?
		//(dad, mom, madam)
		
		Scanner scan=new Scanner (System.in);
	//	System.out.println("Pleease enter word to check if it is a palindrome");
	//	String word=scan.nextLine();
		
	//	String reverse= "";
		
	//	for(int i=word.length()-1; i>=0; i--) {
	//		reverse+=word.charAt(i);
	//	}
	//	if(word.equalsIgnoreCase(reverse)) {
	//		System.out.println("The word is palindrome");
	//	}else {
	//		System.out.println("The word is not a palindrome");
	//	}
	//	System.out.println(reverse);
		
		
		
		
		
		
		
		System.out.println("Please enter palindrome");
		String pal=scan.nextLine();
		String rewind="";
		
		for(int j=pal.length()-1; j>=0; j--) {
			rewind+=pal.charAt(j);	
		}
		if(pal.equalsIgnoreCase(rewind)) {
			System.out.println("Palidnrome correct");
		}
		else {
			System.out.println("Palindrome not correct");
		}
		System.out.println(rewind);
		
		
		
		System.out.println("------------------------------------");
		
		
		System.out.println("PLease enter word");
		String yol=scan.nextLine();
		String rever="";
		
		for(int a=yol.length()-1; a>=0; a--) {
			rever+=yol.charAt(a);
		}
		if(yol.equalsIgnoreCase(rever)) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
		System.out.println(rever);
		
		
		System.out.println("-------------------------------------");
		
		System.out.println("Hello will you please enter a word you think is Palindrome");
		String word=scan.nextLine();
		String backwords="";
		
		for(int b=word.length()-1; b>=0; b--) {
			backwords+=word.charAt(b);
		}
		if(word.equalsIgnoreCase(backwords)) {
			System.out.println("PALINDROME CHETS");
		}
		else {
			System.out.println("NOT PALINDROME CHETS");
		}
		System.out.println(backwords);
		
		System.out.println("---------------------------------------");
		
		System.out.println("ENTER A FUCKING PALINDROME");
		String fuck=scan.nextLine();
		String doggy="";
		
		for(int c=fuck.length()-1; c>=0; c--) {
			doggy+=fuck.charAt(c);
		}
		if(fuck.equalsIgnoreCase(doggy)) {
			System.out.println("FUCKING PALINDROME");
		}
		else {
			System.out.println("NOT A PALINDROME HAHA");
		}
		System.out.println(doggy);
		
		System.out.println("----------------------------------");
		
		System.out.println("please enter New palindrome");
		String bitch=scan.nextLine();
		String ass="";
		
		for(int p=bitch.length()-1; p>=0; p--) {
			ass+=bitch.charAt(p);
		}
		if(bitch.equalsIgnoreCase(ass)) {
			System.out.println("Congrats new Palindrome");
		}
		else {
			System.out.println("Sorry Not a Palindrome");
		}
		
		System.out.println(ass);
		
		System.out.println("----------------------------------");
		
		
		
		
		
		
		
	}

}
