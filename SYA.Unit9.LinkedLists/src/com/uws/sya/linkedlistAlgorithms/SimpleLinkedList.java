package com.uws.sya.linkedlistAlgorithms;

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
	
	public void insertAfter(Object which, Object  newMember) {
		SimpleListNode aux = findObject(which);
		aux.insertAfter(newMember);
	}

	private SimpleListNode findObject(Object o) {
		SimpleListNode aux = null;
		if (this.getFirst() == null) {
			aux = null;
		}
		if (this.first.getPayload().equals(o)) {
			aux = this.first;
		}
		else {
			SimpleListNode iterator = this.getFirst();
			while (!iterator.getPayload().equals(o)) {
				iterator = iterator.getNext();
			}
			aux = iterator;
		}
		return aux;
	}

	public void swap(Object objectFirst, Object objectSecond) {
		SimpleListNode nodeFirst = this.findPrevious(objectFirst);
		SimpleListNode nodeSecond = this.findPrevious(objectSecond);
		this.swap_Action(nodeFirst, nodeSecond);
		
		
	}

	private SimpleListNode findPrevious(Object objectFirst) {
		SimpleListNode aux = null;
		if (this.getFirst() == null) {
			aux = null;
		}
		if (this.first.getNext() == null) {
			aux = null;
		}
		else {
			SimpleListNode iterator = this.getFirst();
			while (!iterator.getNext().getPayload().equals(objectFirst)) {
				
					iterator = iterator.getNext();
				
			}
			aux = iterator;
		}
		return aux;
	}

	private void swap_Action(SimpleListNode nodeFirst, SimpleListNode nodeSecond) {
		Object originalFirstNext = nodeFirst.getNext().getPayload();
		Object originalSecondNext = nodeSecond.getNext().getPayload();
		
		nodeFirst.getNext().setPayload(originalSecondNext);
		nodeSecond.getNext().setPayload(originalFirstNext);
		
		
		
		
	}
}
