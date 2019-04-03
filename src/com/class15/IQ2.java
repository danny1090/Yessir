package com.class15;

public class IQ2 {

	public static void main(String[] args) {
		//Write Java program to find the second largest number in the array?
		//Maximum and minimum number in the array?
		
		int arr[] = {144, 46, 0, 86, 292,-7};
		
		int min =arr[0];
		int secondLargest= arr[0];
		int largest =arr[0];
		
		for(int a: arr) {
			if(a>largest) {
				largest=a;
			}
			if(a<min) {
				min=a;
			}
		}
		for(int a: arr) {		
			if(a > secondLargest && a < largest) {		
				secondLargest=a;
			}
		}
		System.out.println("min = "+min);
		System.out.println("Second Largest = "+secondLargest);
		System.out.println("Largest = "+largest);	
	}

}
