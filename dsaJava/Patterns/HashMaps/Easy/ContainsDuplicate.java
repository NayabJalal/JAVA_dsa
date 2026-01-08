package Patterns.HashMaps.Easy;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)){
                return true;
            }
            map.put(num,1);
        }
        return false;
    }
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            if(!set.add(n)){
                return true;
            }
        }
        return false;
    }
}
