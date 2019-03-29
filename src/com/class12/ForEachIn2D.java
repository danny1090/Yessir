package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
	
		String[][]groceries= {
				
				{"Apple", "Banana", "Orange", "Mango"},
				{"Carrot", "Brocolli", "Green Bean", "Potato"},
				{"Cheese", "Milk", "Butter", "Yougurt"}		
		};
		
		for(int i=0; i<groceries.length; i++) {
			for(int a=0; a<groceries[i].length; a++) {
				System.out.print(groceries[i][a]+" ");	
			}
			System.out.println();
		}
		
		for(String[] single:groceries) {
			for(String list:single) {
				System.out.print(list+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
