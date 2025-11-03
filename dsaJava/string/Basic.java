package string;

public class Basic {
    public static void main(String[] args) {
        String name = "Nayab";
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

        String modifiedName =  "nayabayab";
        System.out.println(modifiedName.indexOf("ab",4));

    }
}
