package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {
		//lets create an ArrayList of integers from 1-10.
		//remove all odds using iterator
		
		ArrayList<Integer> alist=new ArrayList<>();
		//alist.add(1);
		
		for(int i=0; i<=20; i++) {
			alist.add(i);
		}
		System.out.println(alist);
		
		
		Iterator<Integer> iterator=alist.iterator();
		while(iterator.hasNext()) {
			int numbers=iterator.next();
			if(numbers%2!=0) {
				iterator.remove();
			}
		}
		System.out.println(alist);
	}

}
