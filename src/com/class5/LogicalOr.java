package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		
		
		/*we have 7 days a week
		 * 
		 * 
		 * 
		 * 
		 */
		
		int day=5;
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("It is a weekend ");
		}else {
			System.out.println("Enter valid day");
		}

	}

}
