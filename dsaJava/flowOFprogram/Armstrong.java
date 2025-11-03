package flowOFprogram;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range of an Armstrong number : ");
        System.out.println("Enter the starting range = ");
        int start = sc.nextInt();
        System.out.println("Enter the ending range = ");
        int end = sc.nextInt();
        System.out.println("The Armstrong number between "+ start+ " and "+ end+ " are =");
        for (int i = start; i < end; i++) {
            if (isArmstrong(i))
             System.out.println(i);
        }
    }
    static boolean isArmstrong(int num){
        int copy = num;
        int ans =0;
        while (num>0){
            int dig = num%10;
            ans =  ans + (int)Math.pow(dig,3);
            num/=10;
        }
        return ans==copy;
    }
}
