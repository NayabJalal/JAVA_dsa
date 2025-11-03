package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
//        System.out.println(list);
        // Add elements ---->
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);

    }
}
