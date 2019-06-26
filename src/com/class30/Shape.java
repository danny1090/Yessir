package com.class30;

public interface Shape {

	void calculateArea(double num);
	void calculatePerimeter(double num);
	
}
class Circle implements Shape{

	@Override
	public void calculateArea(double num) {
		double area=3.14*(num*num);
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimeter(double num) {
		double perimeter=2*(num*3.14);
		System.out.println(perimeter);	
	}
	public void whoAmI() {
		System.out.println("I am a circle");
	}
}
class Square implements Shape{

	@Override
	public void calculateArea(double num) {
		double area=num*num;
		System.out.println(area);
	}

	@Override
	public void calculatePerimeter(double num) {
		double perimeter=4*num;
		System.out.println(perimeter);
	}
	
}