package com.class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		int quiz;
		int midTerm;
		int finalScore;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter quiz score");
		quiz=input.nextInt();
		System.out.println("Enter midterm score");
		midTerm=input.nextInt();
		System.out.println("Enter final score");
		finalScore=input.nextInt();
		int grade=(quiz+midTerm+finalScore)/3;
		if(grade >= 90) {
			System.out.println("You are an A student");
		}else if(grade >=70 && grade<90) {
			System.out.println("You are a B student");
		}else if (grade >=50 && grade<70) {
			System.out.println("You are a C student");
		}else {
			System.out.println("You are an F student");
		}
		
		
		
		
		
		
		
		
	}

}
