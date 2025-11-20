package search;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    static int arrangeCoins(int n) {
        int st = 1;
        int end = n;
        while (st<end){
            int mid = st + (end - st) /2 ;
            int coins = mid*(mid+1) / 2;
            if (coins == n) return mid;
            else if (coins < n){
                st = mid+1;
            }
            else end = mid-1;
        }
        return st;
    }
}
