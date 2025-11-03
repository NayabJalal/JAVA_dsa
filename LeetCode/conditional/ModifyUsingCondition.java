package conditional;

import java.util.Arrays;

public class ModifyUsingCondition {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 6, 5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] ch){
        ch[3] = 44;
    }
}
