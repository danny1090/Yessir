package com.class22;

public class Child2 extends Parent {
	String hairType="Straight";
	
	public static void main(String [] args) {
		Child2 obj=new Child2();
		
		System.out.println("Child 2 eye color is "+obj.eyeColor);
		System.out.println("Child 2 hair color is "+obj.hairColor);
		System.out.println("Child 2 has "+obj.nose+" nose");
		obj.Sing();
		obj.playSoccer();
	
	}
	public void playSoccer() {
		System.out.println("Child 2 can play soccer");
	}
}
