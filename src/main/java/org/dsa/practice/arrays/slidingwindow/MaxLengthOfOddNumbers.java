package org.dsa.practice.arrays.slidingwindow;

public class MaxLengthOfOddNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4, 6, 5, 8};
        int k=2;
        int res = maxLengthOfArrayContainingKOddElements(nums, k);
        System.out.println("max array length is "+ res);

    }

    private static int maxLengthOfArrayContainingKOddElements(int[] nums, int k) {
        int left = 0;
        int oddCount = 0;
        int maxLength = 0;

        for (int right=0; right< nums.length; right++) {
            if (nums[right]%2 != 0) {
                oddCount++;
            }

            while (oddCount > k) {
                if (nums[left]%2 != 0) {
                    oddCount--;
                }
                left++;
            }
            //calculate array length
            int currentLen = right - left + 1;
            if (currentLen > maxLength) {
                maxLength = currentLen;
            }
        }
        for (int itr=left; itr<nums.length; itr++) {
            System.out.print(nums[itr] + " ");
        }
        return maxLength;
    }
}
