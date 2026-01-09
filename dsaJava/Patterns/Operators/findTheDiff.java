package Patterns.Operators;

public class findTheDiff {
    public static void main(String[] args) {

    }
    public char findTheDifference(String s, String t) {
        char result=0;
        for(char c:s.toCharArray())
        {
            result^=c;
        }
        for(char c:t.toCharArray())
        {
            result^=c;
        }
        return result;
//        int xor = 0;
//        for(int i=0; i<s.length(); i++) xor ^= s.charAt(i);
//        for(int i=0; i<t.length(); i++) xor ^= t.charAt(i);
//
//        return (char) xor;
    }

    /*
    Operator	Symbol	       logic	             Effect on Math
    AND	          &	        Both must be 1	        Filter/Mask bits
    OR	          |	        Either can be1	          Merge/Set bits
    XOR	          ^	         Must be different	   Find difference/parity
    NOT	          ~	           Flip all bits	      Invert values
    L-Shift	     <<	          Move bits left	      Multiply by 2
    R-Shift	      >>	      Move bits right	       Divide by 2
    */
}
