package com.class30;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		//generic array that stores only String Objecy
		ArrayList<String> names=new ArrayList<String>();
		names.add("David");
		names.add("Josh");
		names.add("John");
		names.add("Danny");
		
		//non generic arrayList - we can store different types of Objects
		ArrayList alist=new ArrayList();
		alist.add("String");//String
		alist.add(100);//Integer
		alist.add(100.10);//Double
		alist.add(true);//Boolean
		alist.add('a');//Character
		
		for(Object values:alist) {
			System.out.println(values);
		}
		
		ArrayList<Boolean> booleanArrayList=new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		for(Object val:booleanArrayList) {
			System.out.println(val);
		}
		
	}
}
