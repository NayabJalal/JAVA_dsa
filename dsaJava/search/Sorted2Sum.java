package search;

import java.util.Arrays;

public class Sorted2Sum {
    public static void main(String[] args) {
        int []arr={3,4,5,7,1,10};
        int target = 15;
        int[] result = twoSum3(arr,target);
        if (result!=null){
            System.out.println(Arrays.toString(result));
        }
        else System.out.println("Not Found");
    }
    static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while (left<right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target){
                return new int[]{left, right};
            }
            else if (currentSum>target) right--;
            else left++;
        }
        return null;
    }
    static int[] twoSum2(int[] nums, int target){ // only for adjacent pair
        int [] ans = new int[2];
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j]+ nums[j-1] == target){
                    ans[0] = j-1;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return null;
    }
    static int[] twoSum3(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
