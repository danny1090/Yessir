package JavaIQ;

import java.util.Arrays;

public class secondLargest {

	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array?
		//Maximum and minimum number in the array?
		
		//second largest number in array
		//1. easiest way
		int[] num= {12,13,12,15,0,-1};
		Arrays.sort(num);
		System.out.println(num[num.length-2]);
		
		//2. more efficient way
		int [] array= {1000,200,222,11};
		int largest=array[0];
		int secondLargest=0;
		
		for(int i=0;i<array.length; i++) {
			if(array[i]>largest) {
				secondLargest=largest;
				largest=array[i];
			}else if (array[i]>secondLargest && array[i]!=largest){
				secondLargest=array[i];
			}

		}
		System.out.println("System.out.println(\"Thelargestnumber=\"+largest+\"andsecondLargest=\"+secondLargest);");
		
		
		
		
		
		
		
	}
}
