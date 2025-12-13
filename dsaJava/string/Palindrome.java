package string;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abba";
        if (isPalindrome2(str)){
            System.out.println("The given String is Palindrome");
        }
        else System.out.println("The given String is not Palindrome");
    }
    static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;

        while (start<end){
            if (str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else return false;
        }
        return true;
    }
    static boolean isPalindrome2(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();  // reverse() is built-in
    }
}
