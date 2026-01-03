package Patterns.SlidingWindow;

import java.util.HashSet;

public class MaxSumSubArray {
    public static void main(String[] args) {

    }
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0;
        long curSum =0,maxSum=0;
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            while (set.contains(nums[j]) || set.size()==k){
                set.remove(nums[i]);
                curSum = curSum-nums[i];
                i++;
            }
            curSum = curSum+nums[j];
            set.add(nums[j]);
            if (set.size()==k){
                maxSum = Math.max(curSum,maxSum);
            }
        }
        return maxSum;
    }
}
