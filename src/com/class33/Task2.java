package com.class33;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		Map<String, String> countries = new HashMap<>();
		countries.put("USA", "DC");
		countries.put("Spain", "Madrid");
		countries.put("Canada", "Quebec");
		countries.put("Brazil", "Rio");
		countries.put("France", "Paris");

		// getting all KEYS
		System.out.println("------for loop-------");
		Set<String> keys = countries.keySet();
		for (String country : keys) {
			System.out.println(country);
		}
		System.out.println("------iterator-------");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// getting all VALUES
		System.out.println("------for loop-------");
		Collection<String> val = countries.values();
		for(String value:val) {
			System.out.println(value);
		}
		System.out.println("------iterator-------");
		Iterator<String> itVal=val.iterator();
		while(itVal.hasNext()) {
			System.out.print(itVal.next()+" ");
		}
		

	}

}
