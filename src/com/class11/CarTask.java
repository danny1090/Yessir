package com.class11;

public class CarTask {

	public static void main(String[] args) {
		String [][] cars= {
				{"Ford", "Jeep", "Chevy"},
				{"Volkswagon", "Audi", "BMW"},
				{"Kia", "Toyota", "Honda"},
				{"Maseratti", "Lamborghini", "FIAT"}

		};
		for (int i=0; i<cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(" "+cars[i][j]);
			}
		}System.out.println();
	}
}
