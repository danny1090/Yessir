package com.class7;

public class Task extends OddNumbers {

	public static void main(String[] args) {
		
		boolean workDay=true;
		int day=1;
		
		while(workDay) {
			if(day<6) {
			System.out.println("I need a day off");	
			}else {
				workDay=false;
			}
			day++;
		}



	
	}

}
