package WednesdayReview;

public class childSuper extends MainSuper {

	childSuper(String a){
		super(a);
		System.out.println("This is the parent with 1 parameter ");
		
	}
	childSuper(String a, String b){
		super(a,b);
		System.out.println("This is the parent with 1 parameter ");
	}
	public static void main(String[] args) {
		childSuper obj=new childSuper("a", "b");
		

	}

}
