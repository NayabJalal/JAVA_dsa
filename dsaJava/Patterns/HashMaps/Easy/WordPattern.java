package Patterns.HashMaps.Easy;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {

    }
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length()!=str.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for (int i = 0; i <  str.length; i++) {
            char c = pattern.charAt(i);
            String s1 = str[i];

            if (map.containsKey(c)){
                if (!s1.equals(map.get(c))){
                    return false;
                }
            } else if (map.containsValue(s1)) {
                return false;
            }
            else {
                map.put(c,s1);
            }
        }
        return true;
    }
}
