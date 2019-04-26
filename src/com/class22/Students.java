package com.class22;

public class Students {

	String name;
	int grade;

	public Students(String name) {
		System.out.println("My name is " + name + " and my average is ");
	}

	int CalculateAvgGrade(int a, int b, int c) {
		return (a + b + c) / 3;
	}

//--------------------------------------------------------------------------------------------

	String studentName;
	int grade1, grade2, grade3;

	public Students(String name, int a, int b, int c) {
		studentName = name;
		grade1 = a;
		grade2 = b;
		grade3 = c;
	}

	public void getAverage() {
		int average = (grade1 + grade2 + grade3) / 3;
		System.out.println("My name is " + studentName + " and my average grade is " + average);
	}

}
