package com.class11;

public class Food {
	public static void main(String [] args) {
		
		String[][] food= {
				{"Burger", "fries", "hotdog", "meatloaf"},
				{"lo mein", "fried rice"},
				{"biryani", "korma", "naan", "chick peas"}	
		};
		
		for (int i=0; i<food.length; i++) {
			for(int j=0; j<food[i].length; j++) {
				System.out.print(" I love "+food[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
