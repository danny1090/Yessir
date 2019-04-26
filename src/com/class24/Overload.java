package com.class24;

public class Overload {
	
	static void overLoads(String str, int a, double b) {
		System.out.println(str+" "+a+" "+b);
	}
	private void overLoad(String a, int b, boolean hungry) {
		System.out.println(a+" "+b+" "+hungry);
	}
	

	public static void main(String[] args) {
		Overload obj=new Overload();
		Overload obj1=new Overload();
		
		obj.overLoads("hello", 12345, 69.96);
		obj.overLoad("goodBye", 555, true);
		
	}

}
