package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
    
	String cityName;
	int temp;
	
	Scanner myScanner=new Scanner(System.in);
	
	System.out.println("Please eneter your city");
	
	cityName=myScanner.nextLine();
	
	System.out.println("Please enter temperature in Fahrenheit");
	
	temp=myScanner.nextInt();
	
	int convertedTemp=(temp-32)*(5/9);
	
	System.out.println("the temperature in the city" +cityName+ " is "+convertedTemp+ "C");
		
	}
}
