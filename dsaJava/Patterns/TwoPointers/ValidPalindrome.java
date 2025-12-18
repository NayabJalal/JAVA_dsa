package Patterns.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abbba"));
    }
    static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (str.isEmpty()){
            return true;
        }
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if (str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}
