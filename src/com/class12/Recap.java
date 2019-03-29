package com.class12;

public class Recap {

	public static void main(String[] args) {
		
		int [][] arr= {
				{1,2,3},
				{10,20,30},
				{100,200,300}

		};
		
		for(int a=0; a<arr.length;a++) {
			for(int i=0; i<arr[a].length; i++) {
				System.out.print(arr[a][i]+",");
			}
			System.out.println();
		}
		System.out.println("------For each Loop------");
		for(int[]singleArray: arr) {
			for(int numbers:singleArray) {
				System.out.print(numbers+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
