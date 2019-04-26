package com.class24;

public class TestingParent {

	public static void main(String[] args) {
		String a;
		a="10";
		double d=12;
		
		Parent parent =new Parent();
		parent.love();
		parent.work();
		
		Child child =new Child();
		child.love();
		child.cry();
		child.work();
		//type casting
		Parent obj=new Child();
		obj.work();//parents work
		obj.love();//child love
		//obj.cry();not accessible
		

	}

}
