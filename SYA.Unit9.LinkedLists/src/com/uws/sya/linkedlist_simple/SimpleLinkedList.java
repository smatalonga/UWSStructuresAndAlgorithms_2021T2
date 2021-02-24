package com.uws.sya.linkedlist_simple;

public class SimpleLinkedList {
	private SimpleListNode first;
	
	public SimpleLinkedList() {
		this.first = null;
	}
	
	public SimpleListNode getFirst() {
		return first;
	}
	
	public void add(Object o) {
		if (first == null) {
			first = new SimpleListNode(o);
		}
		else {
			first.add(o);
		}
	}
}
