package Patterns.TwoPointers;

public class TappingRainWater {
    public static void main(String[] args) {

    }
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]= height[0];
        int ans = 0;
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1],height[i]);
        }
        right[n-1] = height[n-1];
        for (int i = n-2; i >=0 ; i--) {
            right[i] = Math.max(right[i+1],height[i]);
        }
        for (int i = 0; i < n; i++) {
            ans = ans+Math.min(left[i],right[i]) - height[i];
        }
        return ans;
    }
    public int trap2(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int left_max = 0;
        int right_max = 0;
        int ans = 0;

        while(left<=right) {
            if(left_max <= right_max) {
                left_max = Math.max(left_max, height[left]);
                ans += left_max-height[left];
                left++;
            }
            else {
                right_max = Math.max(right_max, height[right]);
                ans += right_max-height[right];
                right--;
            }
        }
        return ans;
    }
}
