package org.dsa.practice.arrays.slidingwindow;

public class MinSubArrayLength {
    /*
    Given an array of positive integers and a target, find the minimum length of a contiguous subarray
    whose sum is greater than or equal to the target.

    nums = [2, 3, 1, 2, 4, 3]
    target = 7
    Expected output 2

    Because:

    [2,3,1,2]       → sum = 8 → length 4
    [3,1,2,4]       → sum = 10 → length 4
    [1,2,4]         → sum = 7 → length 3
    [2,4,3]          → sum = 9 → length 3
    [4,3]            → sum = 7 → length 2  ← minimum
     */

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println("Min sub array length is "+ minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        //we dont know the fix window size here so calculate the sum of each array index and check
        //if the sum < target then we have to keep adding numbers
        //if sum >= target then we have to shrink window and track the min length of array

        int left=0;
        //minLength we have to given any number larger than possible answer
        int minLength=nums.length + 1;
        int sum = 0;

        for (int right=0; right<nums.length; right++) {
            sum = sum + nums[right];

            while (sum >= target) {
                //calculate the min length
                int currentMinLength = right - left + 1;
                if (currentMinLength < minLength) {
                    minLength = currentMinLength;
                }
                //shrink the window by removing left element from sum and left++
                sum = sum - nums[left];
                left++;

            }
        }
        return minLength;

    }
}
