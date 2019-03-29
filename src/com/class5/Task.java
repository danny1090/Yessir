package com.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter height");
		int height = myScanner.nextInt();
		
		if(height<5) {
			System.out.println("Short");
		}else if (height==5 || height<6) {
			System.out.println("Medium");
		}else if (height>=6) {
			System.out.println("Tall");
		}else {
			System.out.println("Please enter valid height");
		}
		
		
		
		
		
		
		
	}

}
