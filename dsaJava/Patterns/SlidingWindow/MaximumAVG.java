package Patterns.SlidingWindow;

public class MaximumAVG {
    public static void main(String[] args) {
    }
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        int left = 0;

        for (int right = k; right < nums.length; right++) {
            sum += nums[right];
            sum -= nums[left];
            left++;
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}
