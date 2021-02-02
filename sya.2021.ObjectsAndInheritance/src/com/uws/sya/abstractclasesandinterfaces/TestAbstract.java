package com.uws.sya.abstractclasesandinterfaces;

public class TestAbstract {

	public static void main(String[] args) {
		Truck t1 = new RetailTruck("TESCO", "WHITE");
		
		GarbageTruck gt1 = new GarbageTruck("Renfrewshire Council", "BROWN");
		
		RetailTruck rt1 = new RetailTruck("ASDA", "GREEN");
		
		Truck var1 = t1;
		Truck var2 = gt1;
		Truck var3 = rt1;
		
		var1.action();
		var2.action();
		var3.action();
		
		
		SmartDevice sd1 = new SmartDevice("GE", "GardenLights");
		
		System.out.println(sd1.repair());
		
		IReparibleThing repThing1 = new SmartDevice("Google", "Home");
		
		System.out.println(repThing1.repair());
		
		
		IReparibleThing repThing2 = (IReparibleThing) var1;
		System.out.println(repThing2.repair());
		
		IReparibleThing irepthings[] = new IReparibleThing[]
				{ (IReparibleThing) var1, (IReparibleThing) var3};
		
		irepthings[0].repair();
		irepthings[1].repair();
		
		
		
		

	}

}
