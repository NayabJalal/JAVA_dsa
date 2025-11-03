package flowOFprogram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int n = sc.nextInt();
        //A year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.
        if (((n % 4 == 0) && (n%100 != 0)) || (n % 400 ==0)) {
            System.out.println("Leap year!!!!");
        } else {
            System.out.println("Not a leap year!!!!");
        }
    }
}
