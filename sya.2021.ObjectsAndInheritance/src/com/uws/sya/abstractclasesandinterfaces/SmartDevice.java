package com.uws.sya.abstractclasesandinterfaces;

public class SmartDevice implements IReparibleThing {
	public SmartDevice(String maker, String name) {
		super();
		this.maker = maker;
		this.name = name;
	}
	private String maker;
	private String name;
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
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
		SmartDevice other = (SmartDevice) obj;
		if (maker == null) {
			if (other.maker != null) {
				return false;
			}
		} else if (!maker.equals(other.maker)) {
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
		return "SmartDevice [maker=" + maker + ", name=" + name + "]";
	}
	@Override
	public String repair() {
		return "Repairing " + this.toString(); 
	}
	
	
}
