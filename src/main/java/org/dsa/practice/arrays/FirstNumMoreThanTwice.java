package org.dsa.practice.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstNumMoreThanTwice {
    public static void main(String[] args) {
        //TODO Given an array, find the first number that appears more than once.
        int[] arr = {4, 2, 7, 2, 9, 4};

        int res = firstDuplicate(arr);

        System.out.println(res);
    }

    private static int firstDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num: arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
}
