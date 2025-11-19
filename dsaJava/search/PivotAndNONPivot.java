package search;
public class PivotAndNONPivot {
    static int isPivot(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // ONLY arr[mid] vs arr[start]
            if (arr[mid] < arr[mid + 1]) {
                // Ascending - peak is on RIGHT
                start = mid + 1;
            } else {
                // Descending - peak is on LEFT (or at mid)
                end = mid;
            }
        }
        return arr[start]; // or end
    }
     static int isNotPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                // Mid is in larger part, pivot is on RIGHT
                start = mid + 1;
            } else {
                // Mid is in smaller part, pivot is on LEFT (or at mid)
                end = mid;
            }
        }
        return arr[start]; //or end
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};

        int peakByStartCompare = isPivot(arr);
        int peakByEndCompare   = isNotPivot(arr);

        System.out.println(peakByStartCompare);
        System.out.println(peakByEndCompare);
    }
}
