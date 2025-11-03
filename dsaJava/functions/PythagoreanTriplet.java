package functions;

public class PythagoreanTriplet {

    static boolean isPythagoreanTriplet(int a, int b, int c) {

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

        int mid = a + b + c - max - min;

        return (min * min + mid * mid == max * max);
    }

    public static void main(String[] args) {
        System.out.println(isPythagoreanTriplet(3, 4, 5));   // true
        System.out.println(isPythagoreanTriplet(5, 12, 13)); // true
        System.out.println(isPythagoreanTriplet(1, 2, 3));   // false
        System.out.println(isPythagoreanTriplet(8, 6, 10));  // true
        System.out.println(isPythagoreanTriplet(2, 2, 3));   // false
    }
}
