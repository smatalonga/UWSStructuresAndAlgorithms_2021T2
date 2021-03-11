package com.uws.sya.unti11.excercise2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OfficeT_JUnitTest {

	@Test
	void testHierarchyCreattion() {
		try {
			OfficeT theOffice = new OfficeT("Brown");
			
			
			//Validate my code I need these two methods.
			WorkerNode rootCPY = theOffice.getRoot();
			assertEquals("Brown", rootCPY.getName());
			
			assertNull(rootCPY.getBoss());
			assertNull(rootCPY.getSubordinates());
			assertNull(rootCPY.getPeers());
			
			
		} catch (Exception e) {
			fail("IT should not throw and exception");
		}
		
	}
	
	
	
	@Test
	void testAddSubordinate(){
		try {
			OfficeT theOffice = new OfficeT("Brown");
			
			
			//Validate my code I need these two methods.
			WorkerNode rootpointer = theOffice.getRoot();
			assertEquals("Brown", rootpointer.getName());
			
			assertNull(rootpointer.getBoss());
			assertNull(rootpointer.getSubordinates());
			assertNull(rootpointer.getPeers());
			
			WorkerNode workerNodeWithNameSmith = new WorkerNode("Smith", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameSmith, rootpointer);
			
			
			assertEquals(rootpointer.getSubordinates().getName(), "Smith");
			
		} catch (Exception e) {
			fail("IT should not throw and exception"+e.toString());
		}
	}
	
	@Test
	void testAddSubordinateThenAPeer(){
		try {
			OfficeT theOffice = new OfficeT("Brown");
			
			
			//Validate my code I need these two methods.
			WorkerNode rootpointer = theOffice.getRoot();
			assertEquals("Brown", rootpointer.getName());
			
			assertNull(rootpointer.getBoss());
			assertNull(rootpointer.getSubordinates());
			assertNull(rootpointer.getPeers());
			
			WorkerNode workerNodeWithNameSmith = new WorkerNode("Smith", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameSmith, rootpointer);
			
			
			assertEquals(rootpointer.getSubordinates().getName(), "Smith");
			
			WorkerNode workerNodeWithNameJones = new WorkerNode("Jones", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameJones, rootpointer);
			
			assertEquals(rootpointer.getSubordinates().getPeers().getName(), "Jones");
			
			
		} catch (Exception e) {
			fail("IT should not throw and exception"+e.toString());
		}
	}
	
	
	@Test
	void testAddSubordinateThenAPeerThenAPeer(){
		try {
			OfficeT theOffice = new OfficeT("Brown");
			
			
			//Validate my code I need these two methods.
			WorkerNode rootpointer = theOffice.getRoot();
			assertEquals("Brown", rootpointer.getName());
			
			assertNull(rootpointer.getBoss());
			assertNull(rootpointer.getSubordinates());
			assertNull(rootpointer.getPeers());
			
			WorkerNode workerNodeWithNameSmith = new WorkerNode("Smith", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameSmith, rootpointer);
			
			
			assertEquals(rootpointer.getSubordinates().getName(), "Smith");
			
			WorkerNode workerNodeWithNameJones = new WorkerNode("Jones", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameJones, rootpointer);
			
			assertEquals(rootpointer.getSubordinates().getPeers().getName(), "Jones");
			
			WorkerNode workerNodeWithNameAdam = new WorkerNode("Adam", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameAdam, rootpointer);
			
			assertEquals(rootpointer.getSubordinates().getPeers().getPeers().getName(), "Adam");
			
			
			
		} catch (Exception e) {
			fail("IT should not throw and exception"+e.toString());
		}
	}
	
	@Test
	void testAddSubordinateThenAPeerThenAPeerVerifyingThatNamesAreNotImportant(){
		try {
			OfficeT theOffice = new OfficeT("Casillas");
			
			
			//Validate my code I need these two methods.
			WorkerNode rootpointer = theOffice.getRoot();
			assertEquals("Casillas", rootpointer.getName());
			
			assertNull(rootpointer.getBoss());
			assertNull(rootpointer.getSubordinates());
			assertNull(rootpointer.getPeers());
			
			WorkerNode workerNodeWithNameSmith = new WorkerNode("Pepe", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameSmith, rootpointer);
			
			
			assertEquals(rootpointer.getSubordinates().getName(), "Pepe");
			
			WorkerNode workerNodeWithNameJones = new WorkerNode("Marcelo", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameJones, rootpointer);
			
			assertEquals(rootpointer.getSubordinates().getPeers().getName(), "Marcelo");
			
			WorkerNode workerNodeWithNameAdam = new WorkerNode("Roberto Carlos", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameAdam, rootpointer);
			
			assertEquals(rootpointer.getSubordinates().getPeers().getPeers().getName(), "Roberto Carlos");
			
			
			
		} catch (Exception e) {
			fail("IT should not throw and exception"+e.toString());
		}
	}
	
	
	@Test
	void testAddSubordinateThenAPeerThenASecondLayerSubordinate(){
		try {
			OfficeT theOffice = new OfficeT("Brown");
			
			
			//Validate my code I need these two methods.
			WorkerNode rootpointer = theOffice.getRoot();
			assertEquals("Brown", rootpointer.getName());
			
			assertNull(rootpointer.getBoss());
			assertNull(rootpointer.getSubordinates());
			assertNull(rootpointer.getPeers());
			
			WorkerNode workerNodeWithNameSmith = new WorkerNode("Smith", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameSmith, rootpointer);
			
			
			assertEquals(rootpointer.getSubordinates().getName(), "Smith");
			
			WorkerNode workerNodeWithNameJones = new WorkerNode("Jones", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameJones, rootpointer);
			
			assertEquals(rootpointer.getSubordinates().getPeers().getName(), "Jones");
			
			WorkerNode workerNodeWithNameCarson = new WorkerNode("Carson", rootpointer);
			
			rootpointer.addSubordinate(workerNodeWithNameCarson, workerNodeWithNameSmith);//Adding from the root
			
			assertEquals(rootpointer.getSubordinates().getSubordinates().getName(), "Carson");
			
			
			
		} catch (Exception e) {
			fail("IT should not throw and exception"+e.toString());
			//TODO Make this test run to complete the excercise
		}
	}

}
