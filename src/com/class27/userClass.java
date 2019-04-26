package com.class27;

public class userClass {

	String name;
	long mobileNumber;
	userClass(String name, long mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	userClass() {
	}
}

class userInfo extends userClass {

	public String address;
	
	public userInfo(String name, long mobileNumber, String address){
		super(name, mobileNumber);
		this.address=address;
		
	}
	void userDetails() {
		System.out.println("User name is "+name+" and phone number is "+mobileNumber
				+" and address is "+address);
	}
	
}
