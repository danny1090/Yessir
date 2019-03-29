package com.class7;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int x=1;
		x=x+1;
		System.out.println(x);
		
		int y=1;
		y+=1;
		System.out.println(y);
		
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;
		System.out.println(w);
		
		int v=10;
		v--;
		System.out.println(v);
		
		int a=10;
		int b=++a;//pre increment= first increment--> assign
		System.out.println("Value of b is "+b);
		System.out.println("Value of a is "+a);
		
		int c=10;
		int d=c++;//post increment= first assign--> increment
		
		System.out.println("Value of d is "+d);//11
		System.out.println("Value of c is "+c);//10
		
		int q=100;
		int e=q--;
		
		System.out.println("Value of e is "+e);
		System.out.println("Value of q is "+q);
		
		int h=50;
		int g=--h;
		
		System.out.println("Value of h is "+h);
		System.out.println("Value of g is "+g);
		
		
		
		
		
		
		
		
	}

}
