package com.class20;

public class Task {
	  //* Create a method createEmail().
    //* Based on provided users name, lastName and email type,
    //* your method should return complete email Address;
    //* johnsnow@gmail.com
    //* johnsnow@yahoo.com

	 String createEmail(String usersName, String lastName, String emailType) {
		String email= usersName+lastName+"@"+emailType+".com";
		return;
		
		
		public static void main(String[] args) {
			
			Task obj=new Task();
			String email=obj.createEmail("john","snow","yahoo");
			System.out.println(email.toLowerCase());
			
			email=obj.createEmail("Bob", "Snow", "outlook");
			System.out.println(email);
		}		
}
