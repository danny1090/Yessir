package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		ArrayList<Integer> integerList=new ArrayList<>();
		integerList.add(90);
		integerList.add(33);
		integerList.add(56);
		integerList.add(1000);
		
		System.out.println("Collections before sorting "+integerList);
		Collections.sort(integerList);//class that works with collections(LIST)
		System.out.println("Collections after sorting "+integerList);
		
		
		int[] integerArray= {12, 57, 9799, 1};
		
		Arrays.sort(integerArray);//this class contains various methods for manipulating arrays
		System.out.println("Array after sorting");
		
		for(int s: integerArray) {
			System.out.print(s+" ");
		}
		
		
		
		
		
		
	}

}
