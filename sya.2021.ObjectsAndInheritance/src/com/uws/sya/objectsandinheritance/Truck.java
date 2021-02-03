package com.uws.sya.objectsandinheritance;
/*
 * Com is standard
 * See: https://stackoverflow.com/questions/2125293/java-packages-com-and-org
 * UWS --> My company
 * SYA --> My Project
 * objectsandinheritance --> My Class
 */



public class Truck {
	private String name;
	private String colour;
	private Wheel frontRightWheel;
	private Wheel frontLeftWheel;
	private Wheel backRightWheel;
	private Wheel backLeftWheel;

	//Constructor
	public Truck(String name, String colour) {
		this.name = name;
		this.colour = colour;
		
		this.frontLeftWheel = new Wheel();
		this.frontRightWheel = new Wheel();
		this.backLeftWheel = new Wheel();
		this.backRightWheel = new Wheel();
	}

	public void action() {
		System.out.println("Truck Moving");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override //From Object
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Truck other = (Truck) obj;
		if (colour == null) {
			if (other.colour != null) {
				return false;
			}
		} else if (!colour.equals(other.colour)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Truck [name=" + name + ", colour=" + colour + "]";
	}

	//Setters and Gettres
	//A Class should be open to extension but closed to modification
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
