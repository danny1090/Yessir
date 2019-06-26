package com.class30;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("David");
		names.add("Josh");
		names.add("John");
		names.add("Danny");
		names.add("Arron");
		//names.add(123); not valid since we have to put string 
		System.out.println(names.contains("Josh"));
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		for(String name:names) {
			System.out.println(name);
		}
	}

}
