package com.class27;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone can make call");
	}

	public void sendText() {
		System.out.println("Phone can send text");
	}

	public abstract void unlockPhone();
	public abstract void viewPicture();
}

class iPhone extends Phone {// concrete class - class that is inherited by abstract class
	// or implemented by interface and providing implementation of all
	@Override
	public void unlockPhone() {
		System.out.println("To unlock iPhone we can use Faceid or Fingerprint");
	}
	@Override
	public void viewPicture() {
		System.out.println("To view picture on iPhone go to images");
	}
}

class Samsung extends Phone {
	@Override
	public void unlockPhone() {
		System.out.println("To unlock samsung we need to enter password");
	}

	@Override
	public void viewPicture() {
		System.out.println("To view pictures ");
	}
}