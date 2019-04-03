package com.class14;

public class StringManipulations {

	public static void main(String[] args) {
		// 1 replace()
		
		String str="I am a good tester";
		String newStr=str.replace("a", "e");
		System.out.println(newStr);
		
		String newStr1=str.replace("good", "great");
		System.out.println(newStr1);
		
		String newStr2=str.replace("tester", "programmer");
		System.out.println(newStr2);
		
		String newStr3=str.replace("Tester", "programmer");
		System.out.println(newStr3);
		
		str=str.replace("!", "?");
		System.out.println(str);
		
		str=str.replace("1", "2");
		System.out.println(str);
		
		//2 ReplaceAll();
		
		
		String str1="12Hello 3234 World 465%^%";
		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		String newString=replacedNoNumbers.replaceAll("[^A-Za-z]", "");
		System.out.println(newString);
		
		String str2= "1Hello123";
		System.out.println(str2.replaceAll("[^0-9]", ""));
		
		
		
		
		
		
	}

}
