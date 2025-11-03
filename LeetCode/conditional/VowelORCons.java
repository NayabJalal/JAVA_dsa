package conditional;

import java.util.Scanner;

public class VowelORCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter an alphabet to check : ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if((ch == 'a') || (ch == 'e')|| (ch == 'i') || (ch == 'o') ||(ch == 'u')){
            System.out.println("Vowel");
        }
        else System.out.println("Consonant");
    }
}
