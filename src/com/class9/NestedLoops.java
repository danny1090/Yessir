package com.class9;

public class NestedLoops {

	public static void main(String[] args) {
		
		//for( i=0; i<=5;i++) 
			//System.out.println(i);
		
		//I want to print pattern 12345 5x
		
		for(int i=1;i<=3;i++) { //outer loop is rows
			
			for(int y=1; y<=9;y++) { //inner loop is columns
				
				System.out.print(y);
			}
			System.out.println();
		}
		
		
		
		for(int i=1; i<=7; i++) {
			
			for(int y=1; y<=7; y++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(int i=1; i<=4; i++) {
			for(int y=1; y<=5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(int i=5; i>=1; i--) { //ROWS -
			for(int y=5; y>=1; y--) { //COLUMNS |
				System.out.print(i);
			}
			System.out.println();
		}	
		
		
		
		
		for(int i=1; i<=4; i++) {
			for(int y=1; y<=i;y++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
}
