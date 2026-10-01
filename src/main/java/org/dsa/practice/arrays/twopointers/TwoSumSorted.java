package org.dsa.practice.arrays.twopointers;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9, 14};
        int target = 13;
        System.out.println("is Target exisit "+twoSumSorted(arr, 13));
    }
    public static boolean twoSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (target == (sum)) return true;

            if (sum > target) {
                right--;
            }

            if (sum < target) {
                left++;
            }
        }
        return false;
    }
}
