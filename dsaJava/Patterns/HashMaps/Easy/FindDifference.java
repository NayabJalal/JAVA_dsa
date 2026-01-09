package Patterns.HashMaps.Easy;

import java.util.HashMap;

public class FindDifference {
    public static void main(String[] args) {

    }
    public char findTheDifference(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()){
            if (!map.containsKey(ch)){
                return ch;
            }
            map.put(ch,map.get(ch) -1);
            if (map.get(ch)<0){
                return ch;
            }
        }
        return ' ';
    }

    // we can solve using bitwise operator (xor) too------


}
