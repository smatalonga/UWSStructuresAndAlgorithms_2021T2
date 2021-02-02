package com.uws.sya.abstractclasesandinterfaces;

public class RetailTruck extends Truck implements IReparibleThing, Comparable {

	public RetailTruck(String name, String colour) {
		super(name, colour);
		
	}

	
	@Override
	public void action() {
		System.out.println("Retail truck moving");
	}


	@Override
	public String repair() {
		return "Repairing Retaill Truck " + this.toString();
	}


	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
