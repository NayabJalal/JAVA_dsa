package Patterns.PrefixSum;

public class PivotInteger {
    public static void main(String[] args) {

    }
    public int pivotInteger(int n) {
        int tot = n * (n+1) / 2;
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum += i;
            int rightSum = tot-leftSum+i;
            if (leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}
