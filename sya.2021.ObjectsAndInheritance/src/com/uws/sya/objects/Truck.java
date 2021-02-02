package com.uws.sya.objects;

public class Truck {
	//Class variables
	protected String company;
	private Wheel frontRightWheel;
	private Wheel frontLeftWheel;
	private Wheel backRightWheel;
	private Wheel backLeftWheel;
	
	
	
	//Constructor
	public Truck(String theCompnyThatOwnsTheTruck) {
		this.company = theCompnyThatOwnsTheTruck;
		
		this.frontLeftWheel = new Wheel();
		this.frontRightWheel = new Wheel();
		this.backLeftWheel = new Wheel();
		this.backRightWheel = new Wheel();
	}
	
	//Setter and Getters
	public String getCompany() {
		return this.company;
	}
	
	public void setCompany(String theNewCompnyThatOwnsTheTruck) {
		this.company = theNewCompnyThatOwnsTheTruck;
	}
	
	//Behavioural methods code
	
	public void startAndMoveForward() {
		this.frontLeftWheel.turnForwards();
		this.frontRightWheel.turnForwards();
		this.backLeftWheel.turnForwards();
		this.backRightWheel.turnForwards();
	}
}
