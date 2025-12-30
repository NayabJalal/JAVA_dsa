package Patterns.TwoPointers;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNum {
    public static void main(String[] args) {
        // 2, 3 ,4 ,5,7
        //1-1
        //6-9
        //9-6
        //8-8
        //0-0
        String s = "198861";
        Map<Character, Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        System.out.println(isStrobogrammatic(map,s));

    }
    static boolean isStrobogrammatic(Map<Character, Character> map,String s){
        int i = 0,
                j = s.length()-1;
        while (i<=j){
            char l = s.charAt(i),
                    r = s.charAt(j);

            if (map.containsKey(l)){
                if (map.get(l) != r){
                    return false;
                }
                else {
                    i++;
                    j--;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
}
