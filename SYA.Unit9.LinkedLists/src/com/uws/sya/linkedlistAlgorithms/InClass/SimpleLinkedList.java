package com.uws.sya.linkedlistAlgorithms.InClass;

import javax.swing.text.Position;

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

	public void insertAfter(Object payloadToInsertAfter, Object newPayload) {
		SimpleListNode postionToInsert = this.findNodeWithPayload(payloadToInsertAfter);
		if (postionToInsert != null) {//DEfensive code
			postionToInsert.insertAfter(newPayload);
		}
		else {
			//TODO probale throw an exception
		}
		
	}

	private SimpleListNode findNodeWithPayload(Object payloadToInsertAfter) {
		SimpleListNode iterator = this.getFirst();
		if (iterator != null) {
			boolean nextNullFlag = false;
			while ( (!iterator.getPayload().equals(payloadToInsertAfter)) && (!nextNullFlag)) {
				iterator = iterator.getNext();
				if (iterator.getNext() == null) {
					nextNullFlag = true;
				}
			}
		}
		return iterator;
	}
}
