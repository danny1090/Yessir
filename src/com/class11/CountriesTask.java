package com.class11;

public class CountriesTask {

	public static void main(String[] args) {
		
		String[][] countries= {
				{"USA", "Canada", "Mexico"},
				{"Brazil", "Argentina", "Chile"},
				{"Italy", "France", "Spain"},
				{"Egypt", "South Africa", "Nigeria"}		
		};
		
		for(int i=0; i<countries.length; i++) {
			for(int a=0; a<countries[i].length; a++) {
				System.out.println(countries[i][a]);
			}
			System.out.println();
		}
		
		
		
	}

}
