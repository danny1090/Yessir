package com.class34;

import java.util.*;

public class MapOverview {
	//Create a map of grocery products and its quantity
	
	public static void main(String[] args) {
		
		Map<String, Integer> grocery=new LinkedHashMap<>();
		grocery.put("Milk", 1);
		grocery.put("Bread", 2);
		grocery.put("Eggs", 12);
		grocery.put("Coffee", 2);
		grocery.put("Potato", 2);
		grocery.put("Cookies", 3);
		
		System.out.println(grocery);
		grocery.put("Cheese", 1);
		System.out.println(grocery.size());
		
		grocery.replace("Eggs", 18);
		System.out.println(grocery);
		
		grocery.remove("Cheese");
		System.out.println(grocery);
		
		//retrieving all keys + values using KeySet();
		Set<String> keySet=grocery.keySet();
		for(String key:keySet) {
			System.out.println("Key is "+key+" and values are "+grocery.get(key));
		}
		
		Iterator<String> kit=grocery.keySet().iterator();
		while(kit.hasNext()) {
			String key=kit.next();
			System.out.println(key+":"+grocery.get(key));
		}
		
		
		for(String key:grocery.keySet()) {
			System.out.println(key + ":"+grocery.get(key));
		}
		Iterator<String> keyit=grocery.keySet().iterator();
		while(keyit.hasNext()) {
			String key=keyit.next();
			System.out.println(key+":"+grocery.get(key));
		}
		//retrieving all values using:
		Collection<Integer> valCol=grocery.values();
		for(Integer value:valCol) {// <-------- LONGER WAY
			System.out.println(value);
		}
		for(Integer value:grocery.values()) {
			System.out.println(value); // <----- EASIER WAY
		}
		Iterator<Integer> valueIt=grocery.values().iterator();
		while(valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		
		//retrieving all keys+values using entrySet();
		Set<Map.Entry<String, Integer>> setEntry=grocery.entrySet();
		
		for(Map.Entry<String, Integer> entry:grocery.entrySet()) {
			String mapValue=entry.getKey()+"is == "+entry.getValue();
			System.out.println(mapValue);
		}
		
		Iterator<Map.Entry<String, Integer>> it=grocery.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			String valueFromMap=entry.getKey()+" and value is "+entry.getValue();
			System.out.println(valueFromMap);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
