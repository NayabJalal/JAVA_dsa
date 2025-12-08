package sorting;

public class ThirdMaxNum {
    public static void main(String[] args) {

    }
    public int thirdMax(int[] nums) {
        selection(nums);
        int distinct = 1;
        int last = nums[nums.length - 1]; //last nums
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != last) {
                distinct++;
                last = nums[i];
            }
            if (distinct == 3) return nums[i];
        }
        return nums[nums.length - 1];
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
