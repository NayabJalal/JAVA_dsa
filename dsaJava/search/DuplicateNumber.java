package search;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate2(arr));
    }
    static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[left] == nums[right]) {
                return nums[left]; // found duplicate
            }
            left++;
            right++;
        }
        return -1;
    }
    static int findDuplicate2(int[] nums) {
        int low = 1;
        int high = nums.length - 1; // values range 1..n

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int val : nums) {
                if (val <= mid) count++;
            }

            if (count > mid) {
                high = mid; // duplicate in [low, mid]
            } else {
                low = mid + 1; // duplicate in [mid+1, high]
            }
        }
        return low;
    }
}
