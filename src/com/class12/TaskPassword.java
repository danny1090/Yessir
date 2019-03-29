package com.class12;

import java.util.Scanner;

public class TaskPassword {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String userName, password, confirmPassword, message;
		
		System.out.println("PLease enter username");
		userName=scan.nextLine();
		
		System.out.println("Please enter passwowrd");
		password=scan.nextLine();
		
		System.out.println("Please confirm password");
		confirmPassword=scan.nextLine();
		
		if(!(userName.isEmpty() && password.isEmpty())) { //1st Checkpoint
			
			if(password.length()>=8) { //2nd Checkpoint
				
				if(!password.contains(userName)) { //3rd Checkpoint
					
					if(password.equals(confirmPassword)) { //4th Checkpoint
						message="Your username and password have been created";
						
					}else {
						message="Passwords do not match";
					}
				}else {
					message="Password cannot contain username";
				}
				
			}else {
				message="Password is too short";
			}
			
		}else {
			message="User name and password cannot be empty";
		}
		System.out.println(message);

	}
}
