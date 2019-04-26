package REPLIT;

public class constructor {
	public String name;
	public static String breed = "Mutt";
	public int weight;

	constructor(String name, String breed, int weight){
	   System.out.println(name+" "+breed+" "+weight);
	  }

	constructor(String name, int weight){
	   System.out.println(name+" "+weight);
	  }

	public static void main(String[] args) {
		constructor Dog = new constructor("Tarzan",breed, 50);
		constructor Dog1= new constructor("Tarzan", 50);
	}
}
