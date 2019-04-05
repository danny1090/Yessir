package com.class17;

public class Task3 {
	
	void palindrome(String pal, String rewind) {
		for(int a=pal.length()-1; a>=0; a--) {
			rewind+=pal.charAt(a);
		}
		if(pal.equalsIgnoreCase(rewind)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		System.out.println(rewind);
	}
	
	
	public static void main(String [] args) {
		Task3 obj=new Task3();
		obj.palindrome("madam", "");
		
		
	}
}
