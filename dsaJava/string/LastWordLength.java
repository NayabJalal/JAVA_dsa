package string;

public class LastWordLength {
    public static void main(String[] args) {
        String str = "This world is a Shit";
        System.out.println(lengthOfLastWord(str));
    }
    static int lengthOfLastWord(String s) {
        String temp = s.trim();
        int count =0;
        for (int i = temp.length()-1; i >=0; i--) {
            if (temp.charAt(i)!=' '){
                count++;
            }
            else break;
        }
        return count;
    }
}
