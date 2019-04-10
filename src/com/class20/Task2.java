package com.class20;

public class Task2 {

	public boolean retPal(String s) {
		String rewind = "";
		boolean flag=false;
		
		
		for (int i = s.length() - 1; i >= 0; i--) {
			rewind += s.charAt(i);
		}
		if (s.equalsIgnoreCase(s)) {
			flag=true;
		} 
		
		return flag;
	}

	public static void main(String[] args) {
		Task2 obj=new Task2();
		obj.retPal("hello");
		
	}

}
