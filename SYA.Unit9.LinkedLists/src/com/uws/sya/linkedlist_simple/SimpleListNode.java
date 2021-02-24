package com.uws.sya.linkedlist_simple;

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
}
