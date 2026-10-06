package org.dsa.practice.arrays.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class AtMostKDistinctCharacters {
    /*
    Input: s = "aabacbebebe", k = 3
    Output: 7
    Explanation: The longest substring with exactly
    3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.
     */
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;

        int res = longestSubstringWithKDistinctCharacter(s, k);
        System.out.println("longest substring with distinct char is "+ res);
    }

    private static int longestSubstringWithKDistinctCharacter(String s, int k) {
        char[] arr = s.toCharArray();
        int left=0;
        int maxLength=0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right=0; right<arr.length; right++) {
            //put the element and its freq in map
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            //when window becomes invalid when the map contains more than k entries
            while (map.size() > k) {
                //shrink the window from the left
                //first check if char is 1
                char leftChar = arr[left];
                if(map.get(leftChar) == 1) {
                    //only 1 char exist so remove it
                    map.remove(leftChar);
                } else {
                    //else decrease the counter
                    map.put(leftChar, map.get(leftChar)-1);
                }
                left++;
            }
            //calculate the current array length and compare with maximum
            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}
