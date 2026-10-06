package org.dsa.practice.arrays.slidingwindow;

public class MaxSumofSubArray {
    /*
    FIXED WINDOW PROBLEM
    * Given an integer array and an integer k, find the maximum sum of any contiguous subarray of exactly k elements.

    Input
    nums = [2, 1, 5, 1, 3, 2]
    k = 3
    Expected output
    9

    Because the contiguous groups of 3 are:

    [2, 1, 5] → 8
    [1, 5, 1] → 7
    [5, 1, 3] → 9   ← maximum
    [1, 3, 2] → 6
    * */
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k=3;
        int res = maxSumSubarray(nums, k);
        System.out.println("Max sum of size K is " + res);
    }

    public static int maxSumSubarray(int[] nums, int k) {

//        int maxSum = 0;
//        // the i can go only till n-k which is last window starting position
//        // but this is bruteforce approach
//        for (int i=0; i< nums.length - k; i++) {
//            int sum=0;
//            //inner loop will calculate the window sum
//            for (int j=i; j<i+k; j++) {
//                sum = sum + nums[j];
//            }
//            if (sum > maxSum) {
//                maxSum = sum;
//            }
//        }
//        return maxSum;

        // Optimal approach

        //first we have to calculate the sum of first window
        int windowSum = 0;
        for (int i=0; i<k; i++) {
            windowSum = windowSum + nums[i];
        }
        int maxSum = windowSum;
        //then instead of calculating again total sum just add the new element in sum and remove left element
        /*
        [2, 1, 5, 1]
         ↑        ↑
        leaving  entering

        windowSum = 8 - nums[3-3] + nums[3]
                  = 8 - nums[0] + nums[3]
                  = 8 - 2 + 1
                  = 7

         */
        for (int i=k; i<nums.length; i++) {
            //remove the left leaving element from sum
            windowSum = windowSum - nums[i-k];
            //add the new element in the window
            windowSum = windowSum + nums[i];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return maxSum;
    }
}
