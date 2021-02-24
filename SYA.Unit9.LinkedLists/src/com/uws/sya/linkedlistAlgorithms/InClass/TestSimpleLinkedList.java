package com.uws.sya.linkedlistAlgorithms.InClass;

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
	void testInsertAfterAlgorithm() {
		SimpleLinkedList mylist = new SimpleLinkedList();
		
		mylist.add(2);
		mylist.add(4);
		mylist.add(6);
		mylist.add(8);
		
		mylist.insertAfter(4, 7);
		
		this.checkListContainsTheSamePayloads(mylist, new Object[] {2,4,7,6,8});
		
	}


	private void checkListContainsTheSamePayloads(SimpleLinkedList mylist, Object[] objects) {
		int arrayIterator = 0;
		SimpleListNode iterator = null;
		if (mylist.getFirst() == null) {
			assertTrue(objects.length == 0);
		}
		else {
			iterator = mylist.getFirst();
			
			while (iterator.getNext() != null) {
				assertEquals(objects[arrayIterator], iterator.getPayload(), "Failed at Position "+arrayIterator);
				arrayIterator++;
				iterator = iterator.getNext();
			}
			arrayIterator++;
			assertEquals(arrayIterator, objects.length);
			
		}
		
	}
	
	
	

}
