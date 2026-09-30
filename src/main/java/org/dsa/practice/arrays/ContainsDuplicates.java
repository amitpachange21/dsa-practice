package org.dsa.practice.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 7, 5};
        //TODO Given an integer array, determine whether any value appears at least twice.
        System.out.println(containsDuplicate(arr));

    }

    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        if (arr.length == 1) return false;

        for (int num: arr) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
