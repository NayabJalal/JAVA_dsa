package Patterns.SlidingWindow;

import java.util.HashSet;

public class LongestSubstringRepeating {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left =0,maxSum=0,currLen=0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxSum = Math.max(maxSum,set.size());
        }
        return maxSum;
    }
}
