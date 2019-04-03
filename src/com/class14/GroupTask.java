package com.class14;

public class GroupTask {

	public static void main(String[] args) {
		
		  System.out.println("Task 1 | Part 1");

          int a=10;
            int b=20;
            a=a+b; //first this should be there a=10+20=30
            b=a-b; //b= 30-20=10
            a=a-b;//a=30-10=20
            System.out.println(a);
            System.out.println(b);
            
            System.out.println("Task 1 | Part 2");

            //swap Strings
            String x="Hello";
            String y="Welcome";
            x=x+y; //HelloWelcome
            y=x.substring(0,(x).length()-y.length());
            x=x.substring(y.length());
            System.out.println(x);
            System.out.println(y);
            
            System.out.println("-----------------------");
            
            //2
            System.out.println("Task 2 | Part 1 and 2");

            int arr[] = { 14, 46, 0, 100, 86, 92, -1 };

            int minimum = arr[0];
            int largest = arr[0];
            int secondLargest = arr[0];

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] > largest) {
                    largest = arr[i];
                }
                if (arr[i] > secondLargest && arr[i] < largest) {
                    secondLargest = arr[i];
                }
                if (arr[i] < minimum) {
                    minimum = arr[i];
                }
            }
            System.out.println("Minimum number is:" + minimum);
            System.out.println("2nd largest number is:" + secondLargest);
            System.out.println("Largest number is:" + largest);

                System.out.println("-------------------------]");

            
          //3
            System.out.println("Task 3 | Part 1");

            String given="This is a sentence";
            
            //one way
            String replaced=given.replaceAll("[a-zA-Z]", "");
            int alphaChar=given.length()-replaced.length();
            System.out.println(alphaChar);
            
            String replaced1=given.replaceAll("[^A-Za-z]","");
            System.out.println(replaced1.length());
            
            System.out.println("-----------------------------");
        
        //4
            System.out.println("Task 4 | Part 1");

            String z="Welcome to the interview sessions with Syntax";
            System.out.println(z.substring(39));
            
            System.out.println("Task 4 | Part 2");
            
            String [] words=z.split(" ");
            System.out.println(words.length);
            
            System.out.println("Task 4 | Part 3");

            
            for (String string : words) {
                System.out.println(string);
                }
                
            System.out.println("-------------------------");

        //5
            System.out.println("Task 5 | Part 1");
        
            String str="This is in reverse:";
            System.out.println(str);
            char [] array=str.toCharArray();
            for (int i=array.length-1;i>=0;i--) {
            System.out.print(array[i]);
        }
            System.out.println("");
            System.out.println("Task 5 | Part 2");
            
            String str1="This is in reverse:";
            System.out.println(str);
            String [] array1=str.split(" ");
            for (int i=array1.length-1;i>=0;i--) {
                
            System.out.print(array1[i]);
            

}
}}	
		
		

