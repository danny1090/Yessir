package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * write a program that prints out if it is good weather to go out for activity
		 * 
		 * if temperature is between 40 degrees and 80 degrees inclusive no rain we will go for a hike
		 * otherwise we will not go hiking
		 
		 * if temperature is between 25 and 40 inclusive and snowing we will go snowboarding
		 * otherwise we will not go snow boarding
		 * 
		 * if temperature is more than 80 and sunny we will go to the beach
		 * otherwise not go to the beach
		 */
		
		Scanner scan;
		boolean snow, rain, sunny = false;
		int temp;
		String activity;
		
		scan=new Scanner(System.in);
		System.out.println("Please eneter a temperature");
		temp=scan.nextInt();
		activity=scan.nextLine();
		
		
		if (temp>=40 && temp<80) {
			System.out.println("Is it raining?");
			rain=scan.nextBoolean();
			if (rain) {
				activity="Watch a movie";
			}else{
				activity="Go hiking";
			}	
	   }else if (temp>=25 && temp<40) {
			System.out.println("Is it snowing?");
			snow=scan.nextBoolean();
			if (snow) {
				activity= "Snowboarding";
			}else {
				activity= "Coding";
			}		
		}else if (temp>80) {
			System.out.println("Is it sunny?");
			sunny=scan.nextBoolean();
		}	if(sunny) {
				activity="Lets go to the beach";
			}else {
				activity="Lets do more coding";
			}	
		
			
	}

}		