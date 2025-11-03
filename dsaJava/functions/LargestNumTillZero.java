package functions;
//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class LargestNumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (Exit - Press 0) :");
        int n;
        int largest =0;

        while (true){
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            largest = Math.max(largest,n);

        }
        System.out.println("The largest number in above the list is = "+ largest);
    }
}
