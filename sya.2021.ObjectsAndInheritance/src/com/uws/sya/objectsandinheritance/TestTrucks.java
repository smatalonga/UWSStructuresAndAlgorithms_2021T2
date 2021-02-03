package com.uws.sya.objectsandinheritance;

public class TestTrucks {

	
	
	public static void main(String[] args) {
		
	
		
		Truck t1 = new Truck("Tesco", "Blue");
		Truck t2 = new Truck("ASDA", "Green");
		Truck t3_sameas_t1 = new Truck("Tesco", "Blue");
		
		GarbageTruck gt1 = new GarbageTruck("Council", "Brown", 40);
		GarbageTruck gt2 = new GarbageTruck("Private", "Orange");
		
		Truck[] listOfTrucks = new Truck[4];
		listOfTrucks[0] = t1;
		listOfTrucks[1] = t2;
		listOfTrucks[2] = gt1;
		listOfTrucks[3] = gt2;
		
		//you can deal with all Truck elements
		//regardless of their type
		//without checking their type
		for(Truck t : listOfTrucks) {
			t.action();//THt the same signal can produce different behaviours we call "Polymorphism"!
		}
		
		
		if (listOfTrucks[3].getClass() == GarbageTruck.class) {
			System.out.println("PLEASE DONT DO THIS! :-) ");
		}
				
				
		if (t1.equals(t3_sameas_t1)) {
			t1=t3_sameas_t1;
			System.out.println("My trucks are equal");
		}
		else {
			System.out.println("My trucks are different");
		}
		
		
		String aux1 = t1.toString();
		String aux2 = listOfTrucks[0].toString();
	
		System.out.println(aux1);
		
		/*
		if (aux1.equals(aux2)) {
			System.out.println("T1 and listOfTrucks[0] produce the same output to ToString");
			if (t1.equals(listOfTrucks[0])) {
				System.out.println("\t they are the 'same' Truck (equals has been redefined)");
				Object o1 = t1;
				Object o2 = listOfTrucks[0];
				if (o1.equals(o2)) {
					System.out.println("\t\t they are the 'same' Object");
				}
			}
		}
		*/
		/////////////////////////////////////////////////////////
		///////  CASTING and DOWNCASTING //////////////////////
		////////////////////////////////////////////////////////
		
		GarbageTruck anotherGarbageTruckVariable = (GarbageTruck) listOfTrucks[3];//Casting
		
		System.out.println(anotherGarbageTruckVariable.toString());
		
		
		
		
		
		runTimeErrorExample();
		

	}

	private static void runTimeErrorExample() {
		Truck foxInSheepTruck = new Truck("Fox", "blue");
		
		
		GarbageTruck secondListOfGarbageTrucks[] = new GarbageTruck[3];
		secondListOfGarbageTrucks[0] = new GarbageTruck("BMW", "Red");
		secondListOfGarbageTrucks[1] = new GarbageTruck("SCANIA", "Red");
		
		
		secondListOfGarbageTrucks[2] = (GarbageTruck) foxInSheepTruck;//CASTING
		for(GarbageTruck gt : secondListOfGarbageTrucks) {
			System.out.println(gt.toString());
		}
		Truck t = secondListOfGarbageTrucks[0];
		
	}

}
