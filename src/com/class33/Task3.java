package com.class33;

import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		//Create a map of Best Buy store. Place
		//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
		//Print all keys and values from a Best Buy map using EntrySet.
		
		Map<Integer, String> buy=new LinkedHashMap<>();
		buy.put(7664847, "Printer");
		buy.put(7879885, "TV");
		buy.put(7658324, "Microwave");
		buy.put(7900258, "Camera");
		buy.put(1639502, "Speaker");
		
		System.out.println(buy);
		
		//For Loop
		for(Map.Entry<Integer, String> entry:buy.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		//Iterator
		Iterator<Map.Entry<Integer, String>> buyIt=buy.entrySet().iterator();
		while(buyIt.hasNext()) {
			Map.Entry<Integer, String> me=buyIt.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		
		

	}

}
