package com.class16;

public class ReviewWeqasDay1 {

	String eyes;
	String hair;
	String nose;
	String shirt;
	
	public static void main (String [] args ) {
		
		ReviewWeqasDay1 weqas=new ReviewWeqasDay1();
		weqas.eyes="blue";
		weqas.hair="blue";
		weqas.nose="brown";
		weqas.shirt="gray";
		weqas.humanEyes();
		
		
		ReviewWeqasDay1 weqas1=new ReviewWeqasDay1();
		weqas1.eyes="green";
		
		System.out.println(weqas1.eyes);
		
		
	}
	void humanEyes() {
		ReviewWeqasDay1 weqas=new ReviewWeqasDay1();
		weqas.eyes="red";
		System.out.println(weqas.eyes);
	}
	
	
	
	

}
