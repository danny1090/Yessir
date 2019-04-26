package WednesdayReview;

public class hello {

	hello(String a){
		this("hello", "bye");
		System.out.println("this is the value of a:"+a);
	}
	hello(String a, String b){
		this("first", "second", "third");
		System.out.println("this is the value of b:"+b);
	}
	hello(String a, String b, String c){
		System.out.println("this is the value of c:"+c);
	}
	public static void main (String [] args) {
		hello obj=new hello("");
		
	}
}
