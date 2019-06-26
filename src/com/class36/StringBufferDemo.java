package com.class36;

public class StringBufferDemo {

	public static void main(String [] args) {
		
		//StringBuffer sb=new StringBuffer("Hello");
		//sb.deleteCharAt(3);
		//System.out.println(sb);
		
		String str="Good morning";
		str.concat("John");//new String("Good morning");
		System.out.println(str);
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" John");
		System.out.println(sb);
		
		StringBuffer sbf=new StringBuffer("wassup");
		sbf.append(" this was yung king");
		System.out.println(sbf);
		
		
		
		
		
		
	}
}
