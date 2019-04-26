package com.class22;

public class Child1 extends Parent{
	String hairType="Curly";
	
	public static void main(String[] args) {
		Child1 childObject=new Child1();
		System.out.println("Child 1 eye color is "+childObject.eyeColor);
		System.out.println("Child 1 hair color is "+childObject.hairColor);
		System.out.println("Child 1 has"+childObject.nose+" nose");
		childObject.Sing();
		childObject.playTennis();
		
		
		Parent parentObject=new Parent();
		
		
		
		

	}
	public void playTennis() {
		System.out.println("Child 1 can play tennis");
	}

}
