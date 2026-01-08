package Patterns.HashMaps.Easy;

import java.util.HashMap;

public class ContainsDupII {
    public static void main(String[] args) {

    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(nums[j])) return true;
            map.put(nums[j], 1);
            if (map.size()>k){
                map.remove(nums[j-k]);
            }
        }
        return false;
    }
}
