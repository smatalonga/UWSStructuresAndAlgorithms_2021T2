package com.uws.sya.abstractclasesandinterfaces;

public class GarbageTruck extends Truck {

	private static final int MaxLoad = 40;
	private int maxLoad;

	public GarbageTruck(String name, String colour) {
		super(name, colour);
		this.maxLoad = GarbageTruck.MaxLoad;
		
	}

	public GarbageTruck(String name, String colour, int maxload) {
		super(name, colour);
		this.maxLoad = maxload;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maxLoad;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		GarbageTruck other = (GarbageTruck) obj;
		if (maxLoad != other.maxLoad) {
			return false;
		}
		return true;
	}

	

	@Override
	public void action() {
		
		System.out.println("Moving and loading garbage");
		//super.action();
	}
	
	public void action(String anAction) {
		System.out.println(anAction);
	}
	
	

	@Override
	public String toString() {
		return "GarbageTruck [maxLoad=" + maxLoad + ", getName()=" + getName() + ", getColour()=" + getColour()
				+ ", getClass()=" + getClass() + "]";
	}

}
