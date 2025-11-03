package search;

public class SearchInString {
    public static void main(String[] args) {
        String str =  "Nayab";
        char search = 'a';
        System.out.println(search2(str , search));
    }
    static boolean search(String str , char ch){
        for (int i = 0; i < str.length(); i++) { //public int length() return value.length >> coder();}
            if (str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str , char ch){
        for(char element : str.toCharArray()){
            if(ch == element) return true;
        }
        return false;
    }
}
