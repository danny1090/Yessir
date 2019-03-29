package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		
		String str="Good morning, students";
		boolean contains= str.contains("morning");
		System.out.println(contains);
		
		String present="Welcome, Asel";
		String neededValue="Welcome,";
		
		boolean flag=present.contains(neededValue);
		System.out.println(flag);
		
		boolean flag1=present.toUpperCase().contains(neededValue);
		System.out.println(flag1);
		
		//startsWith(), endsWith()--> will return true if
		//else --> false
		
		String str1="syntax";
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("X"));
		
		//isEmpty()
		
		System.out.println("____isEmpty()____");
		String str2="Hello";
		boolean bull=str2.isEmpty();
		System.out.println(bull);
		
		
		//CONCAT()-->
		
		String str3="Hello";
		String str4="Alli!";
		
		System.out.println(str3+" "+str4);
		System.out.println(str3.concat(str4));
		
		
		//TRIM() -->will remove spaces at the beginning and the end of String 
		
		String expected="You may qualify for multipolicy discount!";
		String actual="  You may qualify for multipolicy discount! ";
		
		actual=actual.trim();
		System.out.println(expected.equals(actual));
		
	}
}
