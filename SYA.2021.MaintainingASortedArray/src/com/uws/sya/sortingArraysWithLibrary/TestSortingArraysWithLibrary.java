package com.uws.sya.sortingArraysWithLibrary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TestSortingArraysWithLibrary {

	@Test
	void testSelectionSort() {
		
		
		Integer [] myarray = new Integer[] {99, 38, 80,48};
		
		Integer [] myExpectedSortedarray = new Integer[] {38, 48, 80, 99};
		
		SelectionSort.sort(myarray);
		
		assertArrayEquals(myExpectedSortedarray, myarray);	
	}

}
