package search;

public class SquareSum {
    public static void main(String[] args) {

    }
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;
        int a = 0;
        int b = (int) Math.sqrt(c);
        while (a <= b) {
            long sum = (long) a * a + (long) b * b;
            if (sum == c) return true;
            if (sum < c) a++;
            else b--;
        }
        return false;
    }
}
