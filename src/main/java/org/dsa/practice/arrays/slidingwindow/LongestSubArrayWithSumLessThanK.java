package org.dsa.practice.arrays.slidingwindow;

public class LongestSubArrayWithSumLessThanK {
    /*
    Input
    nums = [2, 1, 5, 1, 3, 2]
    k = 7
    Expected output
    3
     */
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k=7;

        int res = longestSubArrayWithSumLessThan(nums, k);
        System.out.println("result is "+ res);
    }

    private static int longestSubArrayWithSumLessThan(int[] nums, int k) {
        //we want to shrink window when sum > K
        int maxLength = 0;
        int left=0;
        int sum=0;

        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            int currentLength;

            //invalid window so we have to shrink
            while (sum > k) {
                //shrink the window by removing the left from sum
                sum = sum - nums[left];
                left++;
            }
            //valid window so count the length
            currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }

        }
        return maxLength;
    }
}
