package Patterns.TwoPointers;

public class ValidPalindrome_II {
    public static void main(String[] args) {

    }
    public boolean validPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return isDelete(left+1, right, s) || isDelete(left, right-1, s);
            }
        }
        return true;
    }
    static boolean isDelete(int left, int right, String s){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
