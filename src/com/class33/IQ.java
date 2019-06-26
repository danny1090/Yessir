package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IQ {

	public static void main(String[] args) {
		// How can you remove all duplicates from ArrayList?
		List<String> alist = new ArrayList<String>();
		alist.add("John");
		alist.add("Jane");
		alist.add("James");
		alist.add("Jasmine");
		alist.add("Jane");
		alist.add("James");
		
		Set<String> hset=new HashSet<>(alist);//remove duplicates in set above
		System.out.println("Set collection: "+hset);
		
		Set<String> link=new LinkedHashSet<>(alist);//keep the order
		System.out.println(link);
		
		
		
		
		
	}

}
