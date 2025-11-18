package search;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4,4, 8, 8};
        int ans = singleNonDuplicate2(nums);
        System.out.println(ans);
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid%2==1) mid--;
            if (nums[mid] == nums[mid+1]) start = mid+2;
            else end = mid;
        }
        return nums[start];
    }
    static int singleNonDuplicate2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
