package Patterns.TwoPointers;

public class WaterContainer {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int area = 1;
        int j = height.length-1;
        while (i<j){
            area = Math.min(height[i],height[j]) * (j-i);
            max = Math.max(max,area);
            if (height[i]<height[j]){
                i++;
            }
            else j--;
        }
        return max;
    }
    static {
        for (int i = 0; i < 500; i++) {
            maxArea2(new int[]{0, 0}); //JIT (Just-In-Time) Compiler Warm-Up : warm JVM execution slightly faster;
        }
    }

    public static int maxArea2(int[] height) {

        int left = 0;
        int right = height.length-1;

        int maxCapacity = Math.min(height[left], height[right]) * (right-left);

        while (left < right) {
            int capacity = 0;
            if(height[left] < height[right]) {
                capacity = height[left] * (right - left);
                left++;
            } else {
                capacity = height[right] * (right - left);
                right--;
            }
            maxCapacity = Math.max(maxCapacity, capacity);
        }

        return maxCapacity;
    }
}
