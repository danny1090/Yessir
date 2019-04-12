package com.class21;

public class InstanceVariable {
	
	String name="John"; //instance variable can have access modifiers 

	public static void main(String[] args) {
		String name="Anna"; //local variable
		System.out.println(name);
		
		System.out.println("---Changing value of local variable---");
		
		name="Olga";
		System.out.println(name);
		
		//Creating 1st Object
		InstanceVariable obj=new InstanceVariable();
		System.out.println(obj.name);
		
		System.out.println("---Changing value of instance variable---");
		
		obj.name="Jack";
		System.out.println(obj.name);
		
		//Creating 2nd Object
		InstanceVariable obj1=new InstanceVariable();
		System.out.println(obj1.name);
		
	}
	public void hello() {
		System.out.println("Hello "+name);
	}

}
