package flowOFprogram;

import java.util.Scanner;

public class CurrencyToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter rupees : ");
        double rupees = sc.nextDouble();
        double usd = rupees/80;
        System.out.println(usd + " USD");
    }
}
