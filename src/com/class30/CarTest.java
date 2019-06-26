package com.class30;

public class CarTest {

	public static void main(String[] args) {
		Car car;
		
		car=new Truck(25000, "blue", 3000);
		double carPrice=car.calculateSalesPrice();
		System.out.println(carPrice);
		
		car=new Sedan("blue", 100, 3000);
		double carPrice1=car.calculateSalesPrice();
		System.out.println(carPrice1);
		
		
		
	}

}
