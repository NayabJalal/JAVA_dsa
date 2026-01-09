package Patterns.HashMaps.Easy;

import java.util.HashMap;

public class UniqueChar {
    public static void main(String[] args) {

    }

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar2(String s) {

        int[] count = new int[123];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int m = 0; m < s.length(); m++) {
            if (count[s.charAt(m)] == 1) {
                return m;
            }
        }
        return -1;
    }
}
