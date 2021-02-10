package com.uws.sya.sortingArraysWithLibrary;

public class SelectionSort {

    public static void sort(Comparable[] values) {
        /* algorithm
            for each object in the array excluding the last object loop // first object
                for each remaining object in the array loop // current object
                    if the current object is less than the first object then
                        swap objects
                    end if
                end loop
            end loop
         */
        Comparable temp;
        Integer size = ArrayUtility.getNumberOfObjects(values);
        for (Integer first = 0; first < size - 1; first++) {
            for (Integer current = first + 1; current < size; current++) {
                if (values[current].compareTo(values[first]) < 0) {
                    temp = values[first];
                    values[first] = values[current];
                    values[current] = temp;
                }
            }
        }
    }
}
