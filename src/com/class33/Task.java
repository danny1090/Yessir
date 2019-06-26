package com.class33;

import java.util.*;

public class Task {

	public static void main(String[] args) {
		Map<Integer, String> building=new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Microsoft");
		building.put(4, "Apple");
		building.put(5, "Google");
		building.put(6, "Syntax");
		building.put(7, "Amazon");
		
		System.out.println(building.size());
		
		building.replace(4, "Sony");
		System.out.println(building);
		
		building.remove(7);
		System.out.println(building);
		
		
		
		
		
		

	}

}
