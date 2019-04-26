package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("-----------Object of a Parent class");
		Phone phone=new Phone();
		phone.hasCamera();
		phone.makeCall();
		
		System.out.println("-----------Object of iPhone class");
		iPhone iphone=new iPhone();
		iphone.hasCamera();
		iphone.makeCall();
		
		System.out.println("-----------Object of Samsung class");
		Samsung sam=new Samsung();
		sam.makeCall();
		sam.hasCamera();
		
		Nokia nokia=new Nokia();
		nokia.hasCamera();
		nokia.makeCall();
		
		Phone p1=new Nokia();
		p1.hasCamera();
		p1.makeCall();
		//p1.cannotBreak(); method is undefined
		//creating a variable of a ParentType
		Phone parentPhone;
		//assigning iPhone object
		parentPhone=new iPhone();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		//assigning samsung object
		parentPhone=new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		//assigning nokia object
		parentPhone=new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		
		
		
		
	}
}
