package WednesdayReview;

public class StringsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abc";
		
		StringBuffer sb=new StringBuffer("def");
		sb.append("abc");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("ghi");
		sb1.append(sb);
		System.out.println(sb1);
	}

}
