package com.uws.sya.linkedlist_simple;

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
	
	
	

}
