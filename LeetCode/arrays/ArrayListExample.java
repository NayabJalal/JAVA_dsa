package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          ArrayList<Integer> list = new ArrayList<>();
//        list.add(34);
//        list.add(32);
//        list.add(31);
//        list.add(38);
//        list.add(39);
//        list.add(12);
//        list.add(56);
//        System.out.println(list.contains(56)); // t/f checks if the obj is present in the list or not;
//        list.set(0,24); // At 0th index change the value to 24;
//        System.out.println(list);
//        list.remove(1);// remove the index number 1

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here
        }
    }
}
