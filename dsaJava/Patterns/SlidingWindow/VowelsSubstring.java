package Patterns.SlidingWindow;

import java.util.HashSet;

public class VowelsSubstring {
    public static void main(String[] args) {

    }
    public int maxVowels(String s, int k) {
        int left=0,right=0;
        int vowel =0;
        int maxLenght=0;
        while (right<s.length()){
             if (isVowel(s.charAt(right))){
                 vowel++;
             }
            if (right-left+1>k){
                if (isVowel(s.charAt(left))){
                    vowel--;
                }
                left++;
            }
            if (right-left+1 == k){
                maxLenght = Math.max(maxLenght,vowel);
            }
            right++;
        }
        return maxLenght;
    }
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
