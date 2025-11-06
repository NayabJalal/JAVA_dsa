package search;

public class SmallestLetter {
    public static void main(String[] args) {
        char[]arr = {'c','f','j'};
        char target = 'c';
        System.out.println(ceiling(arr,target));
    }
    static char ceiling(char[]length , char target){
        int start = 0, end = length.length-1;
        while (start<=end){
            int mid= start + (end -start)/2;
            if (target<length[mid]) end = mid-1;
            else start = mid+1;
        }
        return length[start % length.length]; // when while loop breaks start = end + 1
    }
}
