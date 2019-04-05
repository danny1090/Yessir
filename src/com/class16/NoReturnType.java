package com.class16;

import java.util.Scanner;

public class NoReturnType {
	
	
	public static void main(String [] args) {
		
		NoReturnType green=new NoReturnType();
		
		green.noReturn();
		
		//green.scannerFirstName();
		//green.scannerInt();

		
		green.reverseString();
		
		
		green.vowelCountWithLoop();
		
		green.vowelCountWithReplaceAll();
	}
	void noReturn() {
		NoReturnType green=new NoReturnType();
		System.out.println("I do not have a return type");
		
		
	}
	void scannerFirstName() {
		Scanner scan =new Scanner(System.in);
		scan.nextLine();
		
		
	}
	void scannerInt() {
		Scanner scan =new Scanner(System.in);
		scan.nextInt();
		
		
	}
	void reverseString() {
		String str="seigolonhceT xatnyS";
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
			System.out.println(reverse);
		}
		
		

	}
	void vowelCountWithLoop() {
		String weqas="hello world my name Is wEqas";
		char[] w=weqas.toCharArray();
		char empty;
		for(int i=0;i<=w.length; i++) {
			if(w[i]=='a'||w[i]=='A'||w[i]=='e'||w[i]=='E'||w[i]=='i'
					||w[i]=='I'||w[i]=='o'||w[i]=='O'||w[i]=='u'||w[i]=='U') {
				empty=w[i];
				System.out.println(empty+" ");
			}
		}
		
		
		
		
	}
	void vowelCountWithReplaceAll() {
		String weqas="hello world my name Is wEqas";
		String replace=weqas.replaceAll("[^aA,eE,iI,oO,uU]", "");
		System.out.println(replace);
	}
	
	
	
	
	
	
}