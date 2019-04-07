package com.class19;

public class Application {

	public static void main(String[] args) {
		
				//Constructor
		Human person1=new Human();//<--- method
		person1.eyeColor="pink";
		
		person1.print();
		
		System.out.println(person1.eyeColor);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println(person1.gender);
		

		Human person2=new Human();//<--- method
		person2.eyeColor="orange";
		
		person2.print();
		
		System.out.println(person2.eyeColor);
		System.out.println(person2.height);
		System.out.println(person2.weight);
		System.out.println(person2.gender);
	}

}
