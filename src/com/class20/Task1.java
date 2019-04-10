package com.class20;

public class Task1 {

	protected String reverseString (String s) {
		String reverse="";
		for(int i=s.length()-1; i>=0; i--)
			reverse=reverse+s.charAt(i);
		return reverse;

	}
	
	public boolean isPalindrome(String s) {
		
		boolean flag=false;
		String reverse=reverseString(s);
		
		
		
		if (s.equalsIgnoreCase(s)) {
			flag=true;
		} 
		
		return flag;

	}
	private String [] getWordsFromString(String str) {
		String [] words=str.split(" ");
		return words;
	}

	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		obj.isPalindrome("hello");
		
		boolean isPalindrome=obj.isPalindrome("Hello");
		
		String[] array=obj.getWordsFromString("Have a good night students ");
		for(int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		for(String word:array) {
			System.out.println(word);
		}

	}
}
