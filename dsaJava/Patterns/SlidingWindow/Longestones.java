package Patterns.SlidingWindow;

public class Longestones {
    public static void main(String[] args) {

    }
    public int longestOnes(int[] nums, int k) {
        int left =0,
                max=0,
                zeroMarker=0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0){
                zeroMarker++;
            }
            while (zeroMarker>k){
                if (nums[left] == 0){
                    zeroMarker--;
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}

