package REPLIT;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		//2D ARRAY FINDING HIGHEST VALUE
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
	//should be 8
	    int biggest=a[0][0];
	    for(int i=0; i<a.length; i++){
	      for(int j=0; j<a[i].length; j++)
	      if(a[i][j]>biggest){
	        biggest=a[i][j];
	      }
	    }
	    System.out.println(biggest);
	
	    
	   


		}
	}


