package WednesdayReview;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2;
		int b=0;
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Wrong code/Impossible");
		}finally {
			System.out.println("will implement no matter what");
		}
	}

}
