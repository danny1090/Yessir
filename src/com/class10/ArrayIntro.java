package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num;
		
		num=10; //int num=10;
		
		int[] array1;//declare an array
		int [] array2;//declare an array
		int array3[];//declare an array
		
		array1=new int[4]; //initialize, create an array
		
		//assigning value
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		
		//access values
		
		System.out.println(array1[0]);
		
		int[] numbers=new int[3];
		
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=15;
		numbers[3]=20;
		
		
		System.out.println(numbers[2]); //ArrayIndexOutOfBoundsException
		
		
		String[] a=new String[3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="Bye";
		
		System.out.println(a[1]+" friends");
		
		int [] abc= new int [6];
		
		abc[0]=25;
		abc[1]=26;
		abc[2]=35;
		abc[3]=66;
		abc[4]=68;
		abc[5]=69;
		abc[6]=90;
		
		int []def= {25,26,46,78,35,67,78};
		
		
		String [] apple=new String [3];
		String [] fruit= {"Apple", "Banana", "Strawberry", "Tomato"};
		System.out.println(fruit[1]);
		
		
		
		
		
		
		
		
		
		
	}

}
