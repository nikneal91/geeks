package recursion;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] first = new int[arr.length/2];
        int[] second = new int[arr.length-arr.length/2];
        System.arraycopy(arr,0, first,0, first.length);
        System.arraycopy(arr,arr.length/2, second,0, second.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
    }

}
