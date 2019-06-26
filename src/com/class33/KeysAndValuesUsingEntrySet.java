package com.class33;

import java.util.*;

public class KeysAndValuesUsingEntrySet {

	public static void main(String[] args) {
		//Create a map to store userDetails (name, salary, department, title)
		
		Map<String, String> userDetails=new LinkedHashMap<>();
		userDetails.put("Name", "Alex Smith");
		userDetails.put("Salary", "90000");
		userDetails.put("Department", "90000");
		userDetails.put("Title", "Automation Tester");
		
		System.out.println(userDetails);
		userDetails.entrySet();//returns a set of entries
		for(Map.Entry entry : userDetails.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		Iterator<Map.Entry<String, String>> it=userDetails.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
