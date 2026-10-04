package org.dsa.practice.arrays;

public class MaximumConsecutiveOnes {
    /*

    Given:

    nums = [1, 1, 0, 1, 1, 1, 0, 1]
    Find the maximum number of consecutive 1s.
    Expected output: 3
     */
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = maxConsecutiveOnes(nums);
        System.out.println("max consecutive ones are " + result);
    }

    private static int maxConsecutiveOnes(int[] nums) {
        int maxCountLength = 0;
        int currentCountLen = 0;

        for (int right=0; right<nums.length; right++) {
            //check if right is 1
            if (nums[right] == 1) {
                currentCountLen++;
            } else {
                //reset the counter
                currentCountLen = 0;
            }
            //compare the currentCount and maxCount
            if (currentCountLen > maxCountLength) {
                maxCountLength = currentCountLen;
            }
        }
        return maxCountLength;
    }
}
