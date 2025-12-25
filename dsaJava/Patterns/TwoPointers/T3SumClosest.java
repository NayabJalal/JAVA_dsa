package Patterns.TwoPointers;

import java.util.Arrays;

public class T3SumClosest {
    public static void main(String[] args) {

    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int c = nums[i];
            int newTarget = target - c;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                int currentSum = c+sum;
                if (Math.abs(target - currentSum) < Math.abs(target - result)) {
                    result = currentSum;
                }
                if (sum == newTarget) {
                    return target;
                } else if (sum < newTarget) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
