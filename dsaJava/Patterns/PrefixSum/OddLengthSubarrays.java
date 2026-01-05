package Patterns.PrefixSum;

public class OddLengthSubarrays {
    public static void main(String[] args) {

    }
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        int total = 0;
        for (int len = 1; len <= n; len += 2) {
            for (int i = 0; i + len <= n; i++) {
                total += prefix[i + len] - prefix[i];
            }
        }
        return total;
    }
}
