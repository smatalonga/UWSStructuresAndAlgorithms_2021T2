package com.uws.sya.linkedlistAlgorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestSimpleLinkedList {

	@Test
	void testAnEmptyListIsANullPointer() {

		SimpleLinkedList emptyList = new SimpleLinkedList();
		
		SimpleListNode firstNode = emptyList.getFirst();
		
		assertNull(firstNode);
	}
	
	
	@Test
	void testListWithOnlyOneMember() {
		SimpleLinkedList oneMemberList = new SimpleLinkedList();
		
		oneMemberList.add(1);
		
		assertNotNull(oneMemberList.getFirst());
		
		assertEquals(1, oneMemberList.getFirst().getPayload());
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(new Integer(1));
		a.add(new Integer(1));
		a.toArray();
		
	}
	
	@Test
	void testInsertAfter() {
		SimpleLinkedList myList = new SimpleLinkedList();
		myList.add(2);
		myList.add(4);
		myList.add(6);
		myList.add(8);
		
		myList.insertAfter(6,7);
		
		verifyListMembers(new Object[]{2,4,6,7,8}, myList);
	}


	private void verifyListMembers(Object[] objects, SimpleLinkedList myList) {
		int arrayIterator = 0;
		SimpleListNode iterator = null;
		if (myList.getFirst() == null) {
			assertTrue(objects.length == 0);
		}
		else {
			iterator = myList.getFirst();
			
			while (iterator.getNext() != null) {
				assertEquals(objects[arrayIterator], iterator.getPayload(), "Failed at Position "+arrayIterator);
				arrayIterator++;
				iterator = iterator.getNext();
			}
			arrayIterator++;
			assertEquals(arrayIterator, objects.length);
			
		}
		
	}
	
	
	@Test
	void testSwap() {
		SimpleLinkedList myList = new SimpleLinkedList();
		myList.add(2);
		myList.add(4);
		myList.add(6);
		myList.add(8);
		
		myList.swap(4,8);
		
 		verifyListMembers(new Object[]{2,8,6,4}, myList);
	}

}
