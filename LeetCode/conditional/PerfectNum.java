package conditional;

public class PerfectNum {
    public static void main(String[] args) {
        System.out.println("Perfect number = "+ isPerfect(6));
    }
    static boolean isPerfect(int n){
        int temp = n;
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return temp == sum;
    }
}
