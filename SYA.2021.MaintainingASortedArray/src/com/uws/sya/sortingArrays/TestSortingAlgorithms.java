package com.uws.sya.sortingArrays;

public class TestSortingAlgorithms {
	public static void main(String args[]) {
		TestSortingAlgorithms member = new TestSortingAlgorithms();
		SortingAlgorithmsForintArrays safa = new SortingAlgorithmsForintArrays();
		StringBuilder sb = new StringBuilder();
		
		int[] myIntArrayTestData = member.generateTestData();
		member.prettyPrintArray(myIntArrayTestData);
		
		//selection sort
		//
		Runtime.getRuntime().gc();
		long referencetime, finishtime;
		referencetime = System.nanoTime();
		safa.selectionSort(myIntArrayTestData);
		finishtime = System.nanoTime();
		member.registerAlgorithmTime("Selection Sort", referencetime,finishtime, sb);
		member.getMemoryUsageEstimation(sb);
		member.prettyPrintArray(myIntArrayTestData);
		
		//insert sort
		myIntArrayTestData = member.generateTestData();
		//member.prettyPrintArray(myIntArrayTestData);
		
		Runtime.getRuntime().gc();
		referencetime = System.nanoTime();
		safa.insertionSort(myIntArrayTestData);
		finishtime = System.nanoTime();
		member.registerAlgorithmTime("Insertion Sort", referencetime,finishtime, sb);
		member.getMemoryUsageEstimation(sb);
		member.prettyPrintArray(myIntArrayTestData);
		
		
		//insert sort
		myIntArrayTestData = member.generateTestData();
		//member.prettyPrintArray(myIntArrayTestData);
		Runtime.getRuntime().gc();
		referencetime = System.nanoTime();
		safa.bubbleSort(myIntArrayTestData);
		finishtime = System.nanoTime();
		member.registerAlgorithmTime("Bubble Sort", referencetime,finishtime, sb);
		member.getMemoryUsageEstimation(sb);
		member.prettyPrintArray(myIntArrayTestData);
		
		//Quick sort
		myIntArrayTestData = member.generateTestData();
		//member.prettyPrintArray(myIntArrayTestData);
		Runtime.getRuntime().gc();
		referencetime = System.nanoTime();
		safa.quickSort(myIntArrayTestData);
		finishtime = System.nanoTime();
		member.registerAlgorithmTime("Quick Sort", referencetime,finishtime, sb);
		member.getMemoryUsageEstimation(sb);
		member.prettyPrintArray(myIntArrayTestData);
				
		System.out.println(sb.toString());
	}
	
	
	private void registerAlgorithmTime(String string, long referencetime, long finishtime, StringBuilder sb) {
		double conversionRateToSeconds = 1000000000.0;
		sb.append(string +" ¦ Start: "+ ((double)referencetime/conversionRateToSeconds)+
				"¦ End: "+((double)finishtime/conversionRateToSeconds)+
				"¦ Elapsed: "+ ((double)(finishtime-referencetime)/conversionRateToSeconds) );
		sb.append("\n");
	}


	private int[] generateTestData() 
	{
		int[] output = new int[20];
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

	private void prettyPrintArray(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("{ "+array[0]);
		for (int i = 1; i < array.length; i++) {
			sb.append(", "+ array[i]);
		}
		sb.append("} \n");
		System.out.println(sb.toString());
	}
	
	
	private void getMemoryUsageEstimation(StringBuilder sb) {
		
		Runtime runtime = Runtime.getRuntime();
		
		
	    // Calculate the used memory
	    long memory = runtime.totalMemory() - runtime.freeMemory();
	    sb.append("> Used memory is KB: " + (memory/(1024L)) +"\n");
	    runtime.gc();

	    
	}

    
}
