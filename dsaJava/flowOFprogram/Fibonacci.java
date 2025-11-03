package flowOFprogram;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(" The sum of Fibonacci series = "+ fibo(5));
    }
    static int fibo(int n){
        int a =0;
        int b=1;
        int max = a+b;
        if(n ==1 ) return a;
        if (n == 2) return max;
        for (int i = 3; i <= n ; i++) {
            int third = a+b;
            max = max + third;
            a=b;
            b=third;
        }
        return max;
    }
}
