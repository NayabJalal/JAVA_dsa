package functions;

public class Prime {
    public static void main(String[] args) {
        if(isPrime(11)){
            System.out.println("----Prime number----");
        }
        else System.out.println("----Not a Prime Number----");

    }
    static boolean isPrime(int n){
        int count =2;
        int sqrt = (int) Math.sqrt(n);

        if (n <= 1)
            return false;
        for (int i = 2; i <= sqrt; i++) {
            if (n%i == 0 ){
                return false;
            }
        }
        return true;
    }
}
