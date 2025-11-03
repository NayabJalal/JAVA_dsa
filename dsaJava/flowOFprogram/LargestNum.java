package flowOFprogram;

//Take 3 numbers as input and print the largest number.

public class LargestNum {
    public static void main(String[] args) {
//        System.out.println(" The Largest number between them is = " + largestNum(12,23,31));
        System.out.println("The Largest Number between them is = "+WithoutMax(1,2,3));
    }
    static int largestNum(int a, int b, int c ){
        int max = Math.max(c, Math.max(a,b));
        return max;
    }
    static int WithoutMax(int a, int b , int c){
        int max;
        if ((a>b) && (a>c))
            max = a;
        else if ((b>a) && (b>c))
            max = b;
        else max =c;
        return max;
    }
    static int WithoutMax2(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    static int WithoutMax3(int a, int b, int c) {
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        return max;
    }
}
