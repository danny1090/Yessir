package REPLIT;

import java.util.Scanner;

public class sixThree {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    String word1, word2;
	    int num1,num2;
	    
	    System.out.println("Please enter two strings");
	    word1=scan.nextLine();
	    word2=scan.nextLine();
	    
	    System.out.println("Please enter two numbers");
	    num1=scan.nextInt();
	    num2=scan.nextInt();
	    
	    if (num1==num2 && word1.equals(word2)){
	      System.out.println("AND");
	    }if(num1==num2 || word1==word2){
	      System.out.println("OR");
	    }if(num1!=num2 && word1!=word2){
	      System.out.println("NONE");
	    } else{
	      
	    } 
	      
	 

	}

}
