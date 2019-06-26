package JavaIQ;

public class swap2Numbers {

	public static void main(String[] args) {
		//Write a program to swap 2 numbers without a temporary variable?
		//Swap 2 strings without a temporary variable?
		
		//swap numbers
		int a=10;int b=20;                        
		a=a+b;//first this should be there a=10+20=30
		b=a-b;//b=30-20=10
		a=a-b;//a=30-10=20
		System.out.println(a);
		System.out.println(b);
		
		//swap strings
		String x="Hello";
		String y="Welcome";
		x=x+y;
		y=x.substring(0,(x).length()-y.length());
		x=x.substring(y.length());
		System.out.println(x);
		System.out.println(y);
		

		
	}
}
