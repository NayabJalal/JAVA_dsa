package sorting;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1;        // last valid element in nums1
        int y = n - 1;        // last element in nums2
        int right = m + n - 1; // last index

        while (y >= 0) { // Only need to place elements from nums2
            if (x >= 0 && nums1[x] > nums2[y]) {
                nums1[right] = nums1[x];
                x--;
            } else {
                nums1[right] = nums2[y];
                y--;
            }
            right--;
        }
    }
}
