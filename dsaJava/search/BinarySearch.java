package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,7,9,12,19,23,43,67,78,98,99};
        int target = 17;
        System.out.println(binary(arr,target));
    }
    static int binary(int[] arr, int target){
        int start=0, end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(target==arr[mid]) return mid;
            if (target<arr[mid]) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
}
