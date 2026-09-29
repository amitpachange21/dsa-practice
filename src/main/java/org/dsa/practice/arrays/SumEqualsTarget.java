package org.dsa.practice.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumEqualsTarget {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 4, 15, 5};
        int target = 9;

        //TODO 1 Find two numbers whose sum equals the target.
        //normal approach O(n2)
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]+arr[j] == target) {
                    System.out.println(arr[i] +","+ arr[j]);
                }
            }
        }

        //Instead we can check what we can add in current number to get the target so
        // required = target-num;
        Set<Integer> seen = new HashSet<>();
        for (int num: arr) {
            int required = target - num;
            if (seen.contains(required)) {
                System.out.println("found");
            }
            seen.add(num);
        }

        // but what if we need to return the index
        // then we need to keep track of number seen and its index so we can use hashmap
        Map<Integer, Integer> seenAndIndex = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            int required = target - arr[i];
            if (seenAndIndex.containsKey(required)) {
                System.out.println("found at "+ seenAndIndex.get(required) + ", " + i);
            }
            seenAndIndex.put(arr[i], i);
        }

    }
}
