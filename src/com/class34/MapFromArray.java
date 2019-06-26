package com.class34;

import java.util.*;

public class MapFromArray {

	public static void main(String[] args) {
		String [] names= {"Mehmet", "Asha", "Danny", "Omar", "Siyar"};
		
		Map<Integer, String> nameMap=new LinkedHashMap<>();
		int key=1;
		for(String name:names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
		//printing values using entrySet (loop & iterator)
		
		for(Map.Entry<Integer, String> entry:nameMap.entrySet()) {
			String nameVal=entry.getKey()+":"+entry.getValue();
			System.out.println(nameVal);
		}
		
		
		
		Iterator<Map.Entry<Integer, String>> it=nameMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			String valFromMap=entry.getKey()+" is "+entry.getValue();
			System.out.println(valFromMap);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
