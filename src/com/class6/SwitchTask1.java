package com.class6;

import java.util.Scanner;

public class SwitchTask1 {

	public static void main(String[] args) {
		
		Scanner scan;
		String country;
		String language;
		
		scan =new Scanner(System.in);
		System.out.println("Please enter which country you are from ");
		country=scan.nextLine();
		language=scan.nextLine();
		switch (country) {
		
		case "USA":
			language ="English";
			break;
		case "Italy":
			language= "Italian";
			break;
		case "Mexico":	
			language="Spanish";
			break;
		case "China":
			language="Chinese";
			break;
		case "Japan":
			language="Japanese";
			break;
		case "France":
			language="French";
			break;
		case "Germany":
			language="German";
			break;
		
		}
		System.out.println("You speak " +language);	
		
	}

}
