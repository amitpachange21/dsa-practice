package org.dsa.practice.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MoveDuplicateOnePlace {

    public static void main(String[] args) {
        //TODO Remove duplicates in-place so that the beginning of the array contains
        int[] arr = {1, 1, 2, 2, 3, 4, 4};


        // my approach
//        Set<Integer> seen = new HashSet<>();
//        int index=0;
//
//        for(int i=0; i<arr.length; i++) {
//            if (!seen.contains(arr[i])) {
//                arr[index] = arr[i];
//                index++;
//            }
//            seen.add(arr[i]);
//        }
//        System.out.println(Arrays.toString(arr));

        //correct approach as array is sorted so we can compare adjenect element
        //we will start from index 1 as 0th index will be always unique
        int insertIndex=1;
        for (int i=1; i< arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                arr[insertIndex] = arr[i];
                insertIndex++;
            }
        }
        //normally we have to return this insertIndex in leetcode problem but we will print here
        System.out.println(Arrays.toString(arr));
    }
}
