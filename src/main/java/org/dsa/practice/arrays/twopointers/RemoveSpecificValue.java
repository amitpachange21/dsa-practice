package org.dsa.practice.arrays.twopointers;

import java.util.Arrays;

public class RemoveSpecificValue {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        /*
        * The first k positions should contain the elements that are not 3.
        So:
        k = 2
        and the array's first two positions should be:
        [2, 2]
        * */
        System.out.println(removeElement(nums, val));

    }
    public static int removeElement(int[] nums, int val) {
        int insertPointer = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[insertPointer] = nums[i];
                insertPointer++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return insertPointer;
    }
}
