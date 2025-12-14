package sorting;

import java.util.Arrays;

public class Cookies {
    public static void main(String[] args) {

    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        if(s.length==0) return 0;
        int start = 0;
        int i = s.length-1;
        int j = g.length-1;
        int count = 0;
        while(start<=i && start<=j){
            if(s[i]>=g[j]){
                count++;
                i--;
            }
            j--;
        }
        return count;
    }
}
