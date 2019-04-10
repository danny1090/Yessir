package com.class19;

public class Task {
	
	  //* Create a method createEmail().
      //* Based on provided users name, lastName and email type,
      //* your method should return complete email Address;
      //* johnsnow@gmail.com
      //* johnsnow@yahoo.com

	 String createEmail(String usersName, String lastName, String emailType) {
		String email= usersName+lastName+"@"+emailType+".com";
		return email.toLowerCase();	
	}
	 //Create a class student that will have a method getGrade
	 //your method should accept the score of a student and return a grade
	 //score > 90 - A
	 //score > 80 - B
	 //score > 70 - C
	 //score > 50 - D
	 //anything else - F
	 
	 int getGrade(int a) {
		 if(a>90) {
			 System.out.println("A");
		 }else if(a>80) {
			 System.out.println("B");
		 }else if(a>70) {
			 System.out.println("C");
		 }else if(a>50) {
			 System.out.println("D");
		 }else {
			 System.out.println("F");
		 }
		 return a;
	 }
	 
	public static void main(String[] args) {
		
		Task obj=new Task();
		String email=obj.createEmail("john","snow","yahoo");
		System.out.println(email.toLowerCase());
		
		email=obj.createEmail("Bob", "Snow", "outlook");
		System.out.println(email);
		
		obj.getGrade(77);
		System.out.println("");
		
	}

}
