package search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2,3,7,9,12,19,23,43,67,78,98,99};
        int[] dec = {99,98,78,67,43,23,19,12,9,7,3,2};
        int target = 3;
        System.out.println(binary(dec,target));
    }
    static int binary(int[] arr, int target){
        int start=0, end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while (start<=end){
            int mid = (start+end)/2;
            if(target==arr[mid]) return mid;
            if (isAsc) {
                if (target > arr[mid]) start = mid + 1;
                else end = mid - 1;
            }
            else {
                if (target < arr[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
