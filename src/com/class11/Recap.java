package com.class11;

public class Recap {

	public static void main(String[] args) {
		
		//lets create an array of names and retrieve all values from it 
		//1. Create an array
		String [] names=new String[7];
		
		names[0]= "Asel";
		names[1]= "Awet";
		names[2]= "Arif";
		names[3]= "Weqas";
		names[4]= "Dzmitri";
		names[5]= "Shiva";
		names[6]= "Sandesh";
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		//2. Create an array using array literal
		
		String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
		System.out.println("-------For loop-------");
		for(int i=0; i<studentNames.length; i++) {
			System.out.println(studentNames[i]);
		}
		
		//Retrieve values using: advanced for loop, for each loop, enhanced for loop
		System.out.println("-------Advanced For loop-------");
		for(String student: studentNames) {
			System.out.println(student);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
