package string;

public class Pangram {
    public static void main(String[] args) {

    }
    public boolean checkIfPangram(String sentence) {
        if (sentence.length()<26) return false;
        for (char ch = 'a';ch<='z';ch++){
            if (sentence.indexOf(ch)<0){
                return false;
            }
        }
        return true;
    }
}
