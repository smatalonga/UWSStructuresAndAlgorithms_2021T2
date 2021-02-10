package com.uws.sya.sortingArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSortingAlgorithmsForIntArrays {

	@Test
	void testSelectionSort() {
		
		SortingAlgorithmsForintArrays safa = new SortingAlgorithmsForintArrays();
		
		int [] myarray = new int[] {99, 38, 80,48};
		
		int [] myExpectedSortedarray = new int[] {38, 48, 80, 99};
		
		safa.selectionSort(myarray);
		
		assertArrayEquals(myExpectedSortedarray, myarray);	
	}
	
	@Test
	void testBubbleSort() {
		
		SortingAlgorithmsForintArrays safa = new SortingAlgorithmsForintArrays();
		
		int [] myarray = new int[] {99, 38, 80,48};
		
		int [] myExpectedSortedarray = new int[] {38, 48, 80, 99};
		
		safa.bubbleSort(myarray);
		
		assertArrayEquals(myExpectedSortedarray, myarray);	
	}
	
	@Test
	void testInsertSort() {
		
		SortingAlgorithmsForintArrays safa = new SortingAlgorithmsForintArrays();
		
		int [] myarray = new int[] {99, 38, 80,48};
		
		int [] myExpectedSortedarray = new int[] {38, 48, 80, 99};
		
		safa.insertionSort(myarray);
		
		assertArrayEquals(myExpectedSortedarray, myarray);	
	}
	
	@Test
	void testQuickSort() {
		
		SortingAlgorithmsForintArrays safa = new SortingAlgorithmsForintArrays();
		
		int [] myarray = new int[] {99, 38, 80,48};
		
		int [] myExpectedSortedarray = new int[] {38, 48, 80, 99};
		
		safa.quickSort(myarray);
		
		assertArrayEquals(myExpectedSortedarray, myarray);	
	}

}
