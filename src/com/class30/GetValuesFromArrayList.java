package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetValuesFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("David");
		names.add("Josh");
		names.add("John");
		names.add("Danny");
		
		//1 Way using for loop
		System.out.println("----1 way using for loop----");
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		//2 Way Advance For loop
		System.out.println("----2 way using advance for loop----");
		for(Object name:names) {
			System.out.println(name);
		}
		//3 Way 
		System.out.println("----3 way using iterator----");
		Iterator<String>it=names.iterator();
		//boolean check=it.hasNext();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
	}
}
