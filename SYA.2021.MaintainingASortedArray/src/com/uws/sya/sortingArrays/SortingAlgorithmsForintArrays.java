package com.uws.sya.sortingArrays;



public class SortingAlgorithmsForintArrays {

	public void selectionSort(int[] array) {
		for (int i=0; i< array.length -1; i++) {
			int minValuePos = i;
			for (int j=i+1; j< array.length; j++) {
				if (array[j]<array[minValuePos]) {
					minValuePos = j;
				}
			}
			if (minValuePos != i) {
				//swap
				swap(i, minValuePos, array);
			}
		}
		
		
		
	}
	
	public void bubbleSort(int [] array) {
		for (int i = 0; i < array.length; i++) {
			for(int j=0; j < array.length-1; j++) {
				if (array[j]>array[j+1]) {
					swap(j, j+1, array);
				}
			}
		}
	}
	
	public void quickSort(int[] array) {
		int sortScope = array.length;
		recQuickSort(0,  array.length- 1, array);
	}
	
	private void recQuickSort(int low, int high, int[] array) {
		
		int pivot = array[ low + (high-low)/2];
		int i = low;
		int j = high;
		
		while (i <=j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i<=j) {
				swap(i,j, array);
				i++;
				j--;
			}
		}
		if (low < j) {
			recQuickSort(low, j, array);
		}
		if (i< high) {
			recQuickSort(i, high, array);
		}
	}
	
	
	public void insertionSort(int[] array) {
		
		
		for (int i=1; i<array.length;i++) {
			int valueAtIteratorPosition = array[i];
			int positionToInsert = i;
			while ((positionToInsert>0)&&(array[positionToInsert - 1] > valueAtIteratorPosition)){
				array[positionToInsert] = array[positionToInsert-1];
				positionToInsert=positionToInsert-1;
			}
			array[positionToInsert] = valueAtIteratorPosition;
		}
		
	}
	
	private void swap(int positionX, int positionY, int[] array) {
		int aux = array[positionX];
		array[positionX] = array[positionY];
		array[positionY] = aux;
	}

}
