package com.class32;

public abstract class Insurance {

	public String InsuranceName;
	
	public Insurance(String InsuranceName) {
		this.InsuranceName=InsuranceName;
	}
	public abstract void getQoute();
	public abstract void cancelInsurance();	
	
}
class Car extends Insurance{

	public String carModel;
	public Car(String InsuranceName, String carModel) {
		super(InsuranceName);
		this.carModel=carModel;
		
	}
	
	public void getQoute() {
		System.out.println("Qoute is 20% ");	
	}

	public void cancelInsurance() {
		System.out.println("has to be cancelled through website");
	}
}
class Pet extends Insurance{

	public String petType;
	public Pet(String InsuranceName, String petType) {
		super(InsuranceName);
		this.petType=petType;
	}
	public void petType() {
		System.out.println("pet type will cost $30 more ");
	}
	public void getQoute() {
		System.out.println("Qoute is 20% ");	
	}

	public void cancelInsurance() {
		System.out.println("has to be cancelled through website");
	}
}
class Health extends Insurance{

	public Health(String InsuranceName) {
		super(InsuranceName);
	}
	
	public void getQoute() {
		System.out.println("Qoute is 20% ");	
	}

	public void cancelInsurance() {
		System.out.println("has to be cancelled through website");
	}
}
