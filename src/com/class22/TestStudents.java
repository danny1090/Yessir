package com.class22;

public class TestStudents {

	public static void main(String[] args) {
		
		Students obj=new Students("Danny Cabrera");
		obj.CalculateAvgGrade(90, 78, 89);
		
		Students obj1=new Students("John Smith");
		obj1.CalculateAvgGrade(68, 85, 77);
		
		Students obj2=new Students("Jaco chent");
		obj2.CalculateAvgGrade(68, 85, 77);
		
		Students obj3=new Students("Cab goat");
		obj3.CalculateAvgGrade(68, 85, 77);
		
//-------------------------------------------------------------------------------			
		Students student1=new Students("Danny goat", 89,88,67);
		student1.getAverage();		

	}

}
