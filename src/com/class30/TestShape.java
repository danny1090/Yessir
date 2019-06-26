package com.class30;

public class TestShape {

	public static void main(String[] args) {
		
		Circle circle=new Circle();
		circle.calculateArea(20.5);
		circle.calculatePerimeter(40);
		circle.whoAmI();
		
		Shape obj1=new Square();
		obj1.calculateArea(5);
		obj1.calculatePerimeter(4);
		//obj1.whoAmI(); not available 

		
		
		
	}
}
