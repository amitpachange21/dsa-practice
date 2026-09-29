package org.streams.api.arrays;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 10, 6};

        int currentMax = arr[0];
        // start the loop from 1 index as we have already initialized the 0th element
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            }
        }
        System.out.println(currentMax);
    }
}
