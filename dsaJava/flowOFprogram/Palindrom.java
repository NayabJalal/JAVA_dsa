package flowOFprogram;

public class Palindrom {
    public static void main(String[] args) {
        //System.out.println(palindrome(1));
        System.out.println(palindrome("madam"));
    }
    static boolean palindrome(int n){
        int temp = n;
        int rev =0;
        while (temp>0){
            int dig = temp%10;
            rev = rev*10 + dig;
            temp/=10;
        }
        return rev==n;
    }
    static boolean palindrome(String s){
        String temp = s;
        String rev = "";
        char ch ;
        for (int i = temp.length() - 1; i >= 0; i--) {
            rev = rev + temp.charAt(i);
        }
        return s.equals(rev);
    }
}
