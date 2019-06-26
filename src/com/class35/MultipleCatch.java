package com.class35;

public class MultipleCatch {

	public static void main(String[] args) {
		
		System.out.println("Beginning of code");
		
		
		try {
			
			Thread.sleep(2000);//new InterruptedException();
			System.out.println(10/0);//new ArithmeticException();
			
		} catch(ArithmeticException e) {
			//3 ways to print name and details of an exception
			e.printStackTrace();//name of the exception, details, and location
			System.out.println(e);//name of E and details
			e.getMessage();// details of an E
			

			System.out.println("Code of Arithmetic Exception catch");
		} catch(InterruptedException e) {
			System.out.println("Code of Interrupted Exception catch");
		}

	}

}
