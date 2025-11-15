package search;

public class PerfectSquare {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num) {
        int x = num;
        if (x == 0 || x == 1) return true;
        int start=1, end = x;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;
            if (sq == x) return true;
            if (sq > x) {
                end = mid-1;
            }
            else start = mid +1;
        }
        return false;
    }
}
