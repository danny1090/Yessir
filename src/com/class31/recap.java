package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class recap {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		int[] array= {10,20,30,40};
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(12);//comes from collection
		numbers.add(0, 13);// specific to all List object
		numbers.add(0, 14);
		
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));
		
		numbers.set(1, 33);
		System.out.println(numbers.get(1));
		System.out.println(numbers.contains(33));
		
		//1 way using loop
		System.out.println("-------using for loop--------");
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		//2 way using advanced for loop
		System.out.println("---------using advance for loop----------");
		for(Object num:numbers) {
			System.out.println(num);
		}
		//3rd way using ITERATOR
		System.out.println("--------using ITERATOR--------");
		Iterator<Integer> it=numbers.iterator();
		//hasNext(); next(); remove();
		while(it.hasNext()) {
			int number=it.next();
			System.out.println(number);
		}
		//4th way using while loop
		System.out.println("--------using while loop---------");
		int c=0;
		while(numbers.size()>c) {
			int myNum=numbers.get(c);
			System.out.println(myNum);
			c++;
		}
	}

}
