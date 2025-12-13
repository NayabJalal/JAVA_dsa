package string;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        //String name = "Nayab";
        /*
        String changedName= name.toUpperCase();
        System.out.println(changedName);
        System.out.println(name);
        System.out.println(name.toLowerCase());
        String nonTrimmedString = "             Nayab                ";
        System.out.println(nonTrimmedString.length());
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(trimmedString.length());


        SubArray----------name.subString(int start)
         name.subString(int start, int end);
        System.out.println(name.substring(2));


         name.replace(char oldChar ,char newChar);
        System.out.println(name.replace('N', 'B'));
        name.replace(String target " ", String replacement " " )
        System.out.print(name.replace("a", "bay")); //yab/a/anything present in the string ->> replacement, can be multiple times(a)


        System.out.println(name.startsWith("Na")); // case sensitive
        System.out.println(name.endsWith("ab"));


        System.out.println(name.charAt(2)); //character at index =2;

        System.out.println(name.indexOf("a"));// 1st a , -1 if not found
        System.out.println(name.indexOf("ab")); // ab - substring check , -1 if not found
        System.out.println(name.indexOf("a" , 3)); // index of the given string starting from 3, -1 if not found
        String modifiedName =  "nayabayab";
        System.out.println(modifiedName.indexOf("ab",4)); // ch,string,fromindex,endIndex


*/
        String a = "Nayab";
        String b = "Nayab";
        System.out.println(a==b); // true cuz pointing to the same obj in the StringPool;
        String a1 = "Nayab";
        System.out.println(a1==a);//true
        String a2 = new String("Nayab");
        System.out.println(a2==a1);// false cuz it is creating values outside the pool but in heap

        // use equals() instead of == in String.
        System.out.println(a2.equals(a1));// true, it only checks the values
//        String modifiedName =  "nayabayab";
//        System.out.println(modifiedName.indexOf("ab",4));
        String ans = new Integer(57) + "" + new ArrayList<>();
        System.out.println(ans);

        //Performance of String--
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
//            System.out.println(ch);
            series = series + ch;
        }
        System.out.println(series);
        System.out.println("a" + 'b'); // -> ab
        StringBuilder sb = new StringBuilder("Happy");
        sb.append(" New Year");
        sb.append('!');
        sb.append(2025);
        String hehe = sb.toString();
        System.out.println(hehe);
        System.out.println(Arrays.toString(hehe.split("N")));

    }
}
