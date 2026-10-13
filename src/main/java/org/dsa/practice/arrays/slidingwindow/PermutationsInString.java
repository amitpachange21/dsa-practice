package org.dsa.practice.arrays.slidingwindow;

import java.util.Arrays;

public class PermutationsInString {
    //TODO 567 MED
    /*
    Given two strings, s1 and s2, return true if s2 contains a substring that is a permutation of s1. Otherwise, return false.
    Example 1
    s1 = "ab";
    s2 = "eidbaooo";
    Output: true
    Why? The substring "ba" exists in s2, and "ba" is a permutation of "ab".
    Example 2
    s1 = "ab";
    s2 = "eidboaoo";
    Output: false
     */
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println("is s1 is substring of s2 "+ checkInclusion(s1, s2));

    }
    public static boolean checkInclusion(String s1, String s2) {
        //if s1 lenght is greater than s2 a substring length cannot be greater than target string
        if (s1.length() > s2.length()) {
            return false;
        }
        //we can create two int array to track of frequency
        int[] s1Frequency = new int[26];
        int[] windowFrequency = new int[26];
        int left=0;

        //calculate the frquency of s1
        for(int i=0; i<s1.length(); i++) {
            s1Frequency[s1.charAt(i) - 'a']++;
        }

        //iterate the second string
        for (int right=0; right<s2.length(); right++) {
            windowFrequency[s2.charAt(right) - 'a']++;

            //if window length is equal to the s1 then check if arrays are equal
            if ((right - left + 1) == s1.length()) {
                if (Arrays.equals(windowFrequency, s1Frequency)) {
                    return true;
                }
                //remove the left from window
                windowFrequency[s2.charAt(left) - 'a']--;
                left++;
            }
        }
        return false;
    }
}
