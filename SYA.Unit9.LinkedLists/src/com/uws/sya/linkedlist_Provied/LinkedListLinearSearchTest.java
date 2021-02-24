package com.uws.sya.linkedlist_Provied;

/*
 * this is a Test Class based on Console input and output.
 */
public class LinkedListLinearSearchTest {
    public static void main(String[] args){
        
    	
    	testSortedInputs();
    	testUnSortedInputs();
        testReversedlist();
        
    }

	private static void testReversedlist() {
		SortedLinkedList sorted = new SortedLinkedList();
        sorted.insert(3);
        sorted.insert(5);
        sorted.insert(6);
        sorted.insert(7);
        sorted.insert(8);
        
        SortedADT reversed = sorted.reverse();
        System.out.println("Original");
        System.out.println(sorted);
        System.out.println("Reversed");
        System.out.println(reversed);
	}

	private static void testSortedInputs() {
		System.out.println("Test Sorted Inputs");
		SortedADT sorted = new SortedLinkedList();
        sorted.insert(3);
        sorted.insert(5);
        sorted.insert(6);
        sorted.insert(7);
        sorted.insert(8);
        System.out.println(sorted);
	}
	
	private static void testUnSortedInputs() {
		System.out.println("Test UnSorted Inputs");
		SortedADT sorted = new SortedLinkedList();
        sorted.insert(2);
        System.out.println(sorted);
        sorted.insert(4);
        System.out.println(sorted);
        sorted.insert(3);
        
        System.out.println(sorted);
	}
}
