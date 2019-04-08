package REPLIT;

public class method {

	String disp = "displayLine";
	String newl = "newLine";

	public static void main(String[] args) {
		method obj = new method();

		obj.displayLine();
		obj.newLine();

	}

	void displayLine() {
		System.out.println(disp + " method implementation");
	}

	void newLine() {
		System.out.println(newl + " method implementation");
	}

}
