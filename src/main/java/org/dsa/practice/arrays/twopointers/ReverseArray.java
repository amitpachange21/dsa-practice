package org.dsa.practice.arrays.twopointers;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }
    public static void reverse(int[] nums) {
        int left=0;
        int right = nums.length-1;

        while (left < right) {
            int temp=nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
