package Patterns.SlidingWindow;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {

    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0,product = 1,count = 0;
        for (int j = 0; j < nums.length; j++) {
            product *= nums[j];
            while (product >= k && i<=j) {
                product/=nums[i];
                i++;
            }
            count = count+(j-i+1);
        }
        return count;
    }
}
