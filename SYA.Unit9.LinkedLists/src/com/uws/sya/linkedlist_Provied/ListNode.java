package com.uws.sya.linkedlist_Provied;

/*
 * Based on Slide 3 and 4.
 * Changed container type from object to Comparable.
 */
public class ListNode {
	private Comparable object;
    private ListNode next;
   
	public ListNode(Comparable object) {
		this.object = object;
		this.next = null;
	}
	 
	public Comparable getObject() {
		return object;
	}
	public void setObject(Comparable object) {
		this.object = object;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "ListNode [object=" + object + ", next=" + next + "]";
	}
     
}
