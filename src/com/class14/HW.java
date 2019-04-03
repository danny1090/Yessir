package com.class14;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		String motherName, fatherName, gender, babyName;
		
		System.out.println("Pleas enter mothers name");
		motherName=scan.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+motherName.substring(motherName.length()/2);
		}else if(gender.equalsIgnoreCase("girl")){
			babyName=motherName.substring(0, motherName.length()/2)+fatherName.substring(fatherName.length()/2);
		}else {
			babyName="No suggestion";
		}
		System.out.println(babyName.toUpperCase());
		

	}

}
