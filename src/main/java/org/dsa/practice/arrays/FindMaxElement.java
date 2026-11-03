package org.dsa.practice.arrays;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 10, 6};

        //TODO find the max element
        int currentMax = arr[0];
        int currentMin = arr[0];
        // start the loop from 1 index as we have already initialized the 0th element
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            } else if (arr[i] < currentMin) {
                currentMin = arr[i];
            }
        }
        System.out.println("Max is "+currentMax + " " + "Min is "+ currentMin);
    }
}
