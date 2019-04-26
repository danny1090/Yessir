package com.class28;

public class VehicleTest {

	public static void main(String[] args) {
		//Run time polymorphism
		//Parent class --> child class
		Car car=new BMW("bmw");
		car.drive();
		car.start();
		car.stop();
		
		Vehicle.displayTotalVehicles();
		
		new BMW("bmw");
		new Toyota("");
		Vehicle.displayTotalVehicles();
		
		
		
		
	}
}
