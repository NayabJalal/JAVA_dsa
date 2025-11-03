package conditional;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class TillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (Enter 0 to stop) : ");
        int n = sc.nextInt();
        int sum =0;
        while (n!=0){
            sum = sum +n;
            n = sc.nextInt();
        }
        System.out.println("The total sum of the above given numbers are : " + sum);
    }
}
