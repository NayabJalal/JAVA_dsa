package conditional;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sumNegative = 0;
        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break; // stop input when user enters 0
            }

            if (num < 0) {
                sumNegative += num;
            }
            else if (num % 2 == 0) {
                sumEven += num;
            }
            else {
                sumOdd += num;
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumEven);
        System.out.println("Sum of positive odd numbers: " + sumOdd);
    }
}
