package org.dsa.practice.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        //TODO Move all zeroes to the end while maintaining the relative order of the non-zero elements.
        int[] arr = {0, 1, 0, 3, 12};

        //op should be [1, 3, 12, 0, 0]

        //normal approach initialize another array
//        int[] newArr = new int[arr.length];
//        int nonZeroCnt = 0;
//
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] != 0) {
//                newArr[nonZeroCnt] = arr[i];
//                nonZeroCnt++;
//            }
//        }
//        System.out.println(Arrays.toString(newArr));

        int insertIndex=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertIndex] = arr[i];
                insertIndex++;
            }
        }
        for (int i=insertIndex; i<arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
