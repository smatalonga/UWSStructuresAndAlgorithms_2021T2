package com.uws.sya.objectsandinheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TruckTestCase {

	@Test
	void testEqualsObject() {
		Truck t1 = new Truck("Tesco", "Blue");
		
		Truck t3_sameas_t1 = new Truck("Tesco", "Blue");
		
		
		assertEquals(t1, t3_sameas_t1);
		
		if (!t1.equals(t3_sameas_t1)) {
			fail("Not equals");
		}
	}
	
	@Test
	void testNotEqualsObject() {
		Truck t1 = new Truck("Tesco", "Blue");
		
		Truck t3_sameas_t1 = new Truck("Tesco", "Red");
		
		assertNotEquals(t1, t3_sameas_t1);
	}

}
