package com.uws.sya.objects;

public class MainClass {

	public static void main(String[] args) {
		
		Truck t1 = new Truck("TESCO");
		Truck t2 = new Truck("ASDA");
		
		System.out.println("My frist truck is from "+t1.getCompany());
		System.out.println("My second truck is from "+t2.getCompany());
		
		System.out.println("Moving t1");
		t1.startAndMoveForward();
		

	}

}
