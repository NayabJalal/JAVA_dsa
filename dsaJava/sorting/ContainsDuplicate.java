package sorting;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int index = 0;index<nums.length;index++){
            if(nums[index]==nums[index-1]){
                return true;
            }
        }
        return false;
    }
}
