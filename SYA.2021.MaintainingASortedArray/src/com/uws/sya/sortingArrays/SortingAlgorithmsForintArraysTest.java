package com.uws.sya.sortingArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingAlgorithmsForintArraysTest {

	@Test
	void testSelectionSort() {
		//define the test input
		int[] inputArray = new int[] {6, 7, 3};
		
		//Define the test oracle ~ Expected outcome
		int[] expectedOutputArray = new int[] {3, 6, 7};
		
		//define & set up the System Under Test
		SortingAlgorithmsForintArrays sut = new SortingAlgorithmsForintArrays();
		
		//Stimulate the system under test
		sut.selectionSort(inputArray);
		
		//Establish some comparisons
		assertArrayEquals(expectedOutputArray, inputArray, "Expected and Input are different");
	}
	
	@Test
	void testSelectionSortWintAnArrayofLength1() {
		//define the test input
		int[] inputArray = new int[] {6};
		
		//Define the test oracle ~ Expected outcome
		int[] expectedOutputArray = new int[] {6};
		
		//define & set up the System Under Test
		SortingAlgorithmsForintArrays sut = new SortingAlgorithmsForintArrays();
		
		//Stimulate the system under test
		sut.selectionSort(inputArray);
		
		//Establish some comparisons
		assertArrayEquals(expectedOutputArray, inputArray, "Expected and Input are different");
	}
	
	
	@Test
	void testSelectionSortWintANullArray() {
		//define the test input
		int[] inputArray = null;
		
		//Define the test oracle ~ Expected outcome
		int[] expectedOutputArray = null;
		
		//define & set up the System Under Test
		SortingAlgorithmsForintArrays sut = new SortingAlgorithmsForintArrays();
		
		//Stimulate the system under test
		sut.selectionSort(inputArray);
		
		//Establish some comparisons
		assertArrayEquals(expectedOutputArray, inputArray, "Expected and Input are different");
	}

}
