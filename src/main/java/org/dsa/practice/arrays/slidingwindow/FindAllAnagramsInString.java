package org.dsa.practice.arrays.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    /*
    TODO Find anagrams in string s with a given string p
    You are given two strings, s and p. Return all starting indices in s where a substring is an anagram of p.
    An anagram contains exactly the same characters with the same frequencies, but possibly in a different order.
    Example
    s = "cbaebabacd"
    p = "abc"
    The answer is:
    [0, 6]
     */
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = findAllAnagramsInString(s, p);
        System.out.println("anagrams is at index "+result);

    }

    private static List<Integer> findAllAnagramsInString(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if(p.length() > s.length()) {
            return result;
        }

        int[] pFrequency = new int[26];
        int[] windowFrequency = new int[26];
        int left=0;

        //calculate the frequency of p string
        for(int i=0; i<p.length(); i++) {
            //to calculate frequency we can use below
            pFrequency[p.charAt(i) - 'a']++;
        }

        //iterate the s string and add the character frequency in array
        for(int right=0; right<s.length(); right++) {
            windowFrequency[s.charAt(right) - 'a']++;

            //check if window length is equal to target string p
            if((right - left + 1) == p.length()) {
                //check if arrays are equals using Arrays
                if (Arrays.equals(windowFrequency, pFrequency)) {
                    result.add(left);
                }
                //remove the left from the window irrespective of array equal or not
                windowFrequency[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;
    }
}
