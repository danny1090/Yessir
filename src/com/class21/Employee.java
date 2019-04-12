package com.class21;

public class Employee {
	
	int eID;
	int salary;
	static String CEO="Sumair";

	public static void main(String[] args) {
		
		Employee person1=new Employee();
		person1.eID=100;
		person1.salary=70;
		person1.getEmployeeID();
		
		Employee person2=new Employee();
		person2.eID=200;
		person2.salary=80;
		person2.getEmployeeID();

	}
	public void getEmployeeID() {
		System.out.println("This employee id is "+eID+ " and their salary is "+salary+" and their CEO is "+CEO);
	}
}
