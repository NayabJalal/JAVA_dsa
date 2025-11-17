package search;

public class RotatedArray {
    public static void main(String[] args) {

    }
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        if (nums.length == 1) return nums[0] == target;
        int pivot = pivot(nums);
        if (nums[pivot] == target) return true;
        if (pivot == 0) return binary(nums, target, 0, nums.length - 1);
        if (target >= nums[0]) return binary(nums, target, 0, pivot - 1);
        return binary(nums, target, pivot, nums.length - 1);
    }
    static int pivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) start = mid + 1;
            else if (arr[mid] < arr[end]) end = mid;
            else end--;
        }
        return start;
    }
    static boolean binary(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ( arr[mid] == target) return true;
            else if (arr[mid] < target ) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
/** class Solution {
 public boolean search(int[] nums, int target) {
 if (nums == null || nums.length == 0) return false;

 int start = 0, end = nums.length - 1;

 while (start <= end) {
 int mid = start + (end - start) / 2;

 // found
 if (nums[mid] == target) return true;

 // cannot determine sorted half because of duplicates
 if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
 start++;
 end--;
 }
 // left half is sorted
 else if (nums[start] <= nums[mid]) {
 if (nums[start] <= target && target < nums[mid]) {
 end = mid - 1;
 } else {
 start = mid + 1;
 }
 }
 // right half is sorted
 else {
 if (nums[mid] < target && target <= nums[end]) {
 start = mid + 1;
 } else {
 end = mid - 1;
 }
 }
 }

 return false;
 }
 }
**/