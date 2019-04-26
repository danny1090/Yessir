package com.class25;

public class SyntaxStudent extends Student{

	public void study() {//not possible
		System.out.println("Syntax students must study HARD");
	}
	public void doHomeWork() {
		System.out.println("Syntax students must do REPL");
	}
	void attendClasses(int num,  String str) {
		System.out.println("Syntax students must attend ALL classes and take notes");
	}
	//creating child specific private method doResearch
	private void doResearch() {
		System.out.println("Syntax students must make u");
	}
	
}
