package com.class11;

public class Task2 {

	public static void main(String[] args) {
		
		String [] countries= {"USA", "France", "Brazil", "Russia"};
		
		for (int i=0; i<countries.length; i++) {
			
			if(countries[i].equals("USA")) {
				System.out.println("Washington DC");	
			}else if(countries[i].equals("France")) {
				System.out.println("Paris");
			}else if(countries[i].equals("Brazil")) {
				System.out.println("Rio");
			}else if(countries[i].equals("Russia")) {
				System.out.println("Moscow");
			}
		}
		
		
		String [] array= {"USA", "Afghanistan", "Kazaksthan", "Ukraine"};

		for(String country:array) {
			switch (country) {
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Afghanistan":
				System.out.println("Kabul");
				break;
			case "Kazaksthan":
				System.out.println("Astana");
				break;
			case "Ukraine":
				System.out.println("Kiev");
				break;	
			}
		}
		
		
		
		
	}
}
