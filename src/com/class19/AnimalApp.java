package com.class19;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal obj=new Animal();
		
		System.out.println("-----------Animal 1-------------");
		
		System.out.println(obj.age);
		System.out.println(obj.weight);
		System.out.println(obj.breed);
		System.out.println(obj.name);
		
		obj.name="Joe";
		obj.age=40;
		System.out.println(obj.age);
		
		
		
		Animal obj2=new Animal();
		
		System.out.println("-----------Animal2--------------");
		
		System.out.println(obj2.age);
		System.out.println(obj2.weight);
		System.out.println(obj2.breed);
		System.out.println(obj2.name);
		
		
		int my_array[]= {-1,2,3,4,5,6,7,8,9,10};
		System.out.println("Printing minimum value");
		
		System.out.println(Minimum.minOfValues(my_array));
		
		
		int arr[]= {22,234,565,4,334,23,4,54};
		

	}

}
