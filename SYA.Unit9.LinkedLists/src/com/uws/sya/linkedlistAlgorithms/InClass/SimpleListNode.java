package com.uws.sya.linkedlistAlgorithms.InClass;

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

	public void insertAfter(Object newPayload) {
		SimpleListNode listNodeToAdd = new SimpleListNode(newPayload);
		listNodeToAdd.setNext(this.getNext());
		this.setNext(listNodeToAdd);
		
	}

	private void setNext(SimpleListNode nextListNode) {
		this.next = nextListNode;
		
	}

	public SimpleListNode getNext() {
		return this.next;
	}
}
