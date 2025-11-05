package search;

public class CeilingOF_A_Number {
    public static void main(String[] args) {
        int[]arr = {2,3,4,5,9,14,16,18};
        int target = 17;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[]arr , int target){
        int start = 0, end = arr.length-1;
        while (start<=end){
            int mid= start+ (end -start)/2;
            if (target == arr[mid]) {return mid;};
            if (target>arr[mid]) start = mid+1;
            else end = mid-1;
        }
        return start; // when while loop breaks start will be equal to the end
    }
    static int floor(int[]arr , int target){
        int start = 0, end = arr.length-1;
        while (start<=end){
            int mid= start+ (end -start)/2;
            if (target == arr[mid]) {return mid;};
            if (target>arr[mid]) start = mid+1;
            else end = mid-1;
        }
        return end; // when while loop breaks end will be equal to the start
    }
}
