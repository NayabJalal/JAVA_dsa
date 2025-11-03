package conditional;

import java.util.Scanner;

//
public class NcrANDnpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();
        System.out.println("nCr for the given number is : "+ ncr(n,r));
        System.out.println("nPr for the given number is : "+ npr(n,r));
    }
    static int factorial(int n){
        int fact = 1;
        for (int  i = 1;  i <= n;  i++) {
            fact = fact * i;
        }
        return fact;
    }
    static int ncr(int n , int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    static int npr(int n , int r){
        return factorial(n)/factorial(n-r);
    }
}
