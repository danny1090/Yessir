package com.class5;

public class LogicalOperators {

	public static void main(String[] args) {
		/*if number is between 1-10--> number is small
		 * if number is between 11-->100 number is medium
		 *if number is between 101-->1000 number is large
		 */

		int num=15;
		//true    AND  Fale --> false
		if (num>1 && num <=10) {
			System.out.println("Number is small");
			//true AND   true --> true
		}else if(num>=11 && num<=100) {
			System.out.println("Number is medium");
			// false  AND  FALSE--> false
		}else if (num>=101 && num<=1000) {
			System.out.println("Number is large");
		}else {
			System.out.println("Number is not in our range");
		}
	}

}
