package com.class27;

public abstract class File {

	public abstract void open();// abstract methods dont have a method body
	public void edit() {
		
	}
	public void close() {
		
	}
}
class JavaFile extends File {
	@Override
	public void open() {
		System.out.println("To epen .Java file we need notepad++ or sublime text ");
	}
}
class WordFile extends File {
	@Override 
	public void open() {
		
	}
}
class PDFFile extends File {
	@Override 
	public void open() {
		
	}
	public static void main (String [] args) {
		JavaFile obj=new JavaFile();
		obj.open();
	}
}