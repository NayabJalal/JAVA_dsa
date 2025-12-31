package string;

public class SortingSentence {
    public static void main(String[] args) {

    }
    public String sortSentence(String s) {
        String[] split = s.split(" ");
        String[] ans = new String[split.length];
        for(String element : split){
            int position = element.charAt(element.length()-1) - '1';
            ans[position] = element.substring(0,element.length()-1);
        }
        return String.join(" ", ans);
    }
}
