package functions;

import java.util.Scanner;

public class MaxANDmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numbers : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd numbers : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd numbers : ");
        int c = sc.nextInt();
        int max = (a>b) ? ((a>c)? a : c) : ((b>c)? b : c);
        int min = (a<b) ? ((a<c)? a : c) : ((b<c)? b : c);
        System.out.println("The maximum value for the given numbers : "+max);
        System.out.println("The minimum value for the given numbers : "+min);
    }
}
