package search;

public class RotatedArraysSearch {
    public static void main(String[] args) {
        int[] arr = {5,0,1};
        int target = 5;
        System.out.println(search(arr,target));

    }
    static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int pivot = pivot(nums);
        if (nums[pivot] == target) return pivot;
        if (pivot == 0) return binary(nums, target, 0, nums.length - 1);
        if (target >= nums[0]) return binary(nums, target, 0, pivot - 1);
        return binary(nums, target, pivot, nums.length - 1);
    }
    static int pivot(int[] arr ) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) start = mid + 1;
            else end = mid;
        }
        return start;
    }
    static int binary(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
