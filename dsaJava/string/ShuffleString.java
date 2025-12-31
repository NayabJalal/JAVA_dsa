package string;
public class ShuffleString {
    public static void main(String[] args) {

    }
    public String restoreString(String s, int[] indices) {
        char [] ans = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
    public String restoreString2(String s, int[] indices) {
        int length = s.length();
        StringBuilder sb = new StringBuilder("");
        char ch [] = new char[length];

        for(int i=0; i<s.length(); i++){
            ch[indices[i]] = s.charAt(i);
        }
        sb.append(ch);
        return sb.toString();
    }
}
