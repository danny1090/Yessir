package WednesdayReview;

public class ParentSuper {

	String Parent="parent";
	
	ParentSuper(){
		System.out.println("parent");
	}
}
class SuperKeyword extends ParentSuper{
	String Parent ="Child";
	void hello() {
		super.Parent="df";
		
		System.out.println();
	}
}