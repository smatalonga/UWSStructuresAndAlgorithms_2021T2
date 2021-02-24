package com.uws.sya.linkedlistAlgorithms;

public class SimpleListNode {
	private Object payload;
	private SimpleListNode next;
	
	public SimpleListNode() {
		this.next = null;
		this.payload = null;
	}
	
	public SimpleListNode(Object o) {
		this.next = null;
		this.payload = o;
	}
	
	public void add(Object o) {
		if (this.next == null) {
			this.next = new SimpleListNode(o);
		}
		else {
			this.next.add(o);
		}
	}

	
	public Object getPayload() {
		return this.payload;
	}

	public void insertAfter(Object o) {
		SimpleListNode toInsert = new SimpleListNode(o);
		toInsert.setNext(this.getNext());
		this.setNext(toInsert);
		
	}

	public void setNext(SimpleListNode newNext) {
		this.next = newNext;
		
	}

	public SimpleListNode getNext() {
		
		return this.next;
	}
	 

	public void setPayload(Object payload) {
		this.payload = payload;
		
	}
}
