package com.class13;

public class StringReview {

	public static void main(String[] args) {
		
		//PRINT STRING IN REVERSE
		
		String day ="Sunday";
		for(int i=day.length()-1; i>=0; i--) {
			System.out.print(day.charAt(i));
		}
		
		
		String word=new String("Thursday");
		if(!word.isEmpty()) {
			if(word.length()%2!=0 && word.length()>=3){
				System.out.println();
			}
		}

		
		
	}

}
