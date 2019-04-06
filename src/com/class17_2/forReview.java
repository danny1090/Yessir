package com.class17_2;

public class forReview {

	public static void main(String[] args) {
		forReview obj=new forReview();
		obj.loop();

	}
	void loop() {
		for(int i =0; i<3; i++) {

			for(int y=0; y<3; y++) {
				
				System.out.println("I am inner loop "+y);
			}
			System.out.println("----- I am outer loop -----"+i);
			
		}
	}
}
