package org.dsa.practice.arrays;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        //TODO Return the indices of two numbers whose sum equals the target.
        int[] arr = {2, 7, 11, 15, 20, 25};
        int target = 26;

        int[] res = twoSumMethod(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSumMethod(int[] arr, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            int required = target - arr[i];
            if (seen.containsKey(required)) {
                return new int[] {seen.get(required), i};
            }
            seen.put(arr[i], i);
        }
        return new int[] {};
    }
}
