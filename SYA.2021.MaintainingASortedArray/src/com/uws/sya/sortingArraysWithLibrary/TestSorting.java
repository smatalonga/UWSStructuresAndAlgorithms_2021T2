package com.uws.sya.sortingArraysWithLibrary;

public class TestSorting {

	public static void main(String[] args) {
		Integer[] datatosort = TestSorting.generateTestData();
		System.out.println("Quick sort");
		ArrayUtility.display(datatosort);
		
		QuickSort.sort(datatosort);
		
		ArrayUtility.display(datatosort);
		
		//-------------
		System.out.println("Selection sort");
		datatosort = TestSorting.generateTestData();
		
		ArrayUtility.display(datatosort);
		
		SelectionSort.sort(datatosort);
		
		ArrayUtility.display(datatosort);
		

	}
	
	
	private static Integer[] generateTestData() 
	{
		Integer[] output = new Integer[20];
		output[0] = 99;
		output[1] = 38;
		output[2] = 80;
		output[3] = 48;
		output[4] = 23;
		output[5] = 1;
		output[6] = 96;
		output[7] = 93;
		output[8] = 86;
		output[9] = 28;
		output[10] = 18;
		output[11] = 15;
		output[12] = 51;
		output[13] = 50;
		output[14] = 44;
		output[15] = 76;
		output[16] = 17;
		output[17] = 29;
		output[18] = 58;
		output[19] = 82;
		
		
		return output;
	}

}
