package Patterns.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public static void main(String[] args) {

    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (set.contains(nums[right])){
                return true;
            }
            set.add(nums[right]);
            if (Math.abs(right - left)>=k){
                set.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}
