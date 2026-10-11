package org.dsa.practice.arrays.slidingwindow;

public class LongestSubArrayAfterDeletingZero {
    /*

    Given a binary array containing only 0 and 1, you are allowed to delete exactly one element.
    Find the length of the longest contiguous subarray containing only 1s after that deletion.
    Example
    nums = [1,1,0,1,1,1,0,1]
    If we delete the 0 here:
    [1,1,0,1,1,1]
         ↑ delete
    we get:
    [1,1,1,1,1]
    So the answer can be 5.
     */
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1};
        int res = longestSubarrayAfterDeletingOneElement(nums);
        System.out.println("longest sub array after deleting the 1 element "+ res);
    }

    private static int longestSubarrayAfterDeletingOneElement(int[] nums) {
        int maxLength = 0;
        int zeroCount = 0;
        int left=0;
        for (int right=0; right<nums.length; right++) {
            //count the zeros
            if (nums[right] == 0) {
                zeroCount++;
            }
            //we have to remove one element so if zero count is greater than one then its ihvalid window
            while (zeroCount > 1) {
               //shrink the window from left i.e. remove the left element if its zero
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            //usually we count current window lenght as righ - left + 1 but here we have to sureshot delete one element
            //so its right - left + 1 - 1 so it will right - left
            int currentLength = right - left;
            maxLength = Math.max(currentLength, maxLength);
        }
        return maxLength;
    }
}
