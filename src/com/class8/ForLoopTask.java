package com.class8;

public class ForLoopTask {

	public static void main(String[] args) {
		
		//print number from 1 to 100
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		//Print number from 100 to 1
		for(int i=100; i>=1; i--) {
			System.out.println(i);
		}
		//Print odd numbers from 1 to 20
		for(int i=1; i<=20; i+=2) {
			System.out.println(i);
		}
		//Print even numbers from 20 to 1
		for(int i=20; i>=0;i-=2) {
			System.out.println(i);
		}
		//Print even numbers between 20 to 50(2 Ways)
		for(int a=20; a<=50;a+=2) {
			System.out.println(a);
		}
		
		for (int a=20; a<=50;a++) {
			if(a%2==0) {
				
			}
		}
		//Print odd numbers between 20 to 50(2 Ways)
		for (int a=21; a<=50;a+=2) {
			System.out.println(a);
		}
		
		for (int a=20; a<=50; a++) {
			if(a%2==1) {
				System.out.println(a);
			}
		}
	}
}
