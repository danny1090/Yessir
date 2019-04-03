package com.class16;

public class Phone {

	String color, make;
	int num;
	boolean camera, homeButton; 
	
	public static void main(String [] args) {
		
		Phone iPhone=new Phone();
		iPhone.make="iPhone";
		iPhone.color="Black";
		iPhone.num=10;
		iPhone.camera=true;
		iPhone.homeButton=false;
		
		iPhone.text();
		iPhone.call();
		iPhone.takePictures();
		
		
		Phone andriod=new Phone();
		andriod.make="Galaxy";
		andriod.color="White";
		andriod.num=10;
		andriod.camera=true;
		andriod.homeButton=true;
		
		andriod.text();
		andriod.call();
		andriod.takePictures();
		
		Phone nokia=new Phone();
		nokia.make="Nokia";
		nokia.color="Grey";
		nokia.num=8;
		nokia.camera=false;
		nokia.homeButton=true;
		
		nokia.text();
		nokia.call();
		nokia.takePictures();
		

	}
	void text() {
		System.out.println("You can text on your "+make);
	}
	void call() {
		System.out.println("You can make calls on your "+make);
	}
	void takePictures() {
		System.out.println("You can take pictures on your "+make);
	}
}
