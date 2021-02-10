package com.uws.sya.sortingArraysWithLibrary;

public class QuickSort {

    public static void sort(Comparable[] values) {
        Integer size = ArrayUtility.getNumberOfObjects(values);
        sort(values, 0, size - 1);
    }

    private static void sort(Comparable[] values, Integer start, Integer end) {
        /* algorithm
            if objects to be sorted
                partition the array about the pivot value
                sort the left subarray (values up to the new position of the pivot value)
                sort the right subarray (values from the new position of the pivot value)
            end if
         */
        if (start < end) {
            Integer pivot = partition(values, start, end);
            sort(values, start, pivot - 1);
            sort(values, pivot + 1, end);
        }
    }

    private static Integer partition(Comparable[] values, Integer start, Integer end) {
        /* algorithm
            copy first object of the array to the pivot value
            for each object from the second object to the end of the array loop
                if object to be swapped with pivot value then
                    copy the object to be swapped to the pivot value position
                    copy the object after the pivot value position to the object position of the object just swapped
                    copy the pivot value to the next position
                    note the new pivot value position
                end if
            end loop
         */
        Comparable pivotValue = values[start];
        Integer pivotIndex = start;
        for (Integer index = start + 1; index <= end; index++) {
            if (values[index].compareTo(pivotValue) < 0) {
                values[pivotIndex] = values[index];
                values[index] = values[pivotIndex + 1];
                values[pivotIndex + 1] = pivotValue;
                pivotIndex++;
            }
        }
        return pivotIndex;
    }

}
