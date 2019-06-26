package com.class35;

import java.util.*;

public class Task2 {

	public static List <Exception> getList() {
		
		List<Exception> list=new ArrayList<>();
		//1st try catch for AE
		try {
		System.out.println(10/0);
		
		}catch(ArithmeticException e){
			list.add(e);
		}
		//2nd try catch for ArrayIndexOutOfBoundsException
		int [] array= {12, 13};
		
		try {
		System.out.println(array[3]);
		}catch(ArrayIndexOutOfBoundsException aioe) {
			list.add(aioe);
		}
		//3rd try catch for MismatchInputException
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		
		try {
			int num=scan.nextInt();
		}catch(InputMismatchException ime) {
			list.add(ime);
		}
		//4th try catch for NullPointerException
		String str=null;
		try {
			System.out.println(str.length());
		}catch(NullPointerException npe) {
			list.add(npe);
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		
		List<Exception> exceptionList=getList();
		System.out.println(exceptionList.size());
		
		for(Exception singleException: exceptionList) {
			System.out.println(singleException);
		}
		
		
	}

}
