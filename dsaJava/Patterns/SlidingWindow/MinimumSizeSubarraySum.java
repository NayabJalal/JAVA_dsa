package Patterns.SlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,
                n= nums.length,
                ans = n+1,
                window = 0;
        for (int right = 0; right < n; right++) {
            window = window+nums[right];
            while (window>=target){
                ans = Math.min(ans,right-left+1);
                window = window - nums[left++];
            }
        }
        return ans == n+1 ? 0 : ans;
    }
}
