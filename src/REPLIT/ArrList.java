package REPLIT;

import java.util.ArrayList;

public class ArrList {

	 public static void main(String[] args) {
		    ArrayList<Integer> num=new ArrayList<Integer>();
		    num.add(111);
		    num.add(222);
		    num.add(333);
		    num.add(444);
		    num.add(555);
		    num.add(666);
		    
		    num.remove(0);
		    num.remove(2);
		    num.remove(3);
		    
		    for(int s:num){
		      System.out.println(s);
		      
		    }
		    
		    
		    
		    
		  }
		
}
