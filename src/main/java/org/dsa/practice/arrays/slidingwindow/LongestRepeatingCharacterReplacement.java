package org.dsa.practice.arrays.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    /*

Given a string s and an integer k, you can replace at most k characters in the string.
Find the length of the longest substring that can be made to contain only one repeated character after at most k replacements.
Example
s = "AABABBA"
k = 1
Answer:4
Why?
Take:"AABA"
There are:
A → 3
B → 1
If we replace the B with A:
"AAAA"
So length = 4.
     */
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int res = longestRepeatingCharacterReplacement(s, k);
        System.out.println("result is "+res);
    }

    private static int longestRepeatingCharacterReplacement(String s, int k) {
        char[] arr = s.toCharArray();

        //we have to keep the char and its frequency
        Map<Character, Integer> map = new HashMap<>();
        int maxWindowLength = 0;
        int maxFrequency = 0;
        int left=0;

        for (int right=0; right<arr.length; right++) {
            //we have to put each character in map
            char currentChar = arr[right];
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(currentChar));

            //here in question its asked is we can replace only K elements
            //so this is the main catch window becomes invalid when replacement count > k
            //to identify replacement count we can use windowLength - mostFrequentCharacter
            while ((right - left + 1) - maxFrequency > k) {
                //now we have to shrink from left i.e. decrease the count
                char leftChar = arr[left];
                int count = map.get(arr[left]);
                if (leftChar == 1) {
                    map.remove(arr[left]);
                } else {
                    map.put(leftChar, count-1);
                }
                left++;
            }
            int currentWindowLength = right - left + 1;
            if (currentWindowLength > maxWindowLength) {
                maxWindowLength = currentWindowLength;
            }
        }
        return maxWindowLength;
    }
}
