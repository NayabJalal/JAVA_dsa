package search;

public class GuessNumber {

    // Suppose this is the picked number
    static int picked = 6;

    public static void main(String[] args) {
        GuessNumber obj = new GuessNumber();
        int n = 10; // range from 1 to 10
        int result = obj.guessNumber(n);
        System.out.println("Picked number is: " + result);
    }
    public int guessNumber(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);  // call the guess API

            if (res == 0) {
                return mid;  // found the number
            } else if (res == 1) {
                left = mid + 1;  // our guess is lower
            } else { // res == -1
                right = mid - 1; // our guess is higher
            }
        }
        return left;
    }
    // Mock version of the guess API
    int guess(int num) {
        if (num == picked) return 0;
        if (num < picked) return 1;
        return -1;
    }
}
