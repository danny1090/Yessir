package com.class32;

public class ArrayTest {

	public static void main(String[] args) {
		String a="A";
		String b=new String("B");
		
		int[] intArray= {10,21,34};
		String[] stringArray= {"hello", "bye"};
		
		//Can we place Objects into Array?
		
		Visa visa1=new Visa("Visa Platinum");
		Visa visa2=new Visa("Visa Platinum");
		Visa visa3=new Visa("Visa Platinum");
		
		AX ax1=new AX("AX Platinum");
		AX ax2=new AX("AX Platinum");
		AX ax3=new AX("AX Platinum");
		
		CreditCard[] visaArray= {visa1, visa2, visa3, ax1, ax2, ax3};
		//Array of OBJECTS
		Object[] obj= {visa1, ax1, "John", 77, true, 89.9};
		
		
		
		
	}

}
