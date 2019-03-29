package com.class6;

public class Switch {

	public static void main(String[] args) {
		
		int day=5;
		String dayName;
		
		if(day==1) {
			dayName="Monday";
		}else if (day==2) {
			dayName="Tuesday";
		}else if (day==3) {
			dayName="Wednesday";
		}else if(day==4) {
			dayName="Thursday";
		}else if(day==5) {
			dayName="Friday";
		}else if(day==6) {
			dayName="Saturday";
		}else if(day==7) {
			dayName="Sunday";
		}else {
			dayName="Invalid";
		}
		System.out.println("Todya is "+dayName);
		
		
		switch (dayName) {
		
			case "Monday":
				day=1;
				break;
			case "Tuesday":
				day=2;
				break;
			case "Wednesday":
				day=3;
				break;
			case "Thursday":
				day=4;
				break;
			case "Friday":
				day=5;
				break;
			case "Saturday":
				day=6;
				break;
			case "Sunday":
				day=7;
				break;					
				
		}

	}

}
