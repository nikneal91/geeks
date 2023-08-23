package array;

import java.util.Arrays;

public class RemoveDupArray {

    private static int[] removeDup(int[] arr, int index, int upd) {

        if ( index >= arr.length-1) {
            for ( int j=upd+1; j<= index;j++) {
                arr[j] = -1;
            }
            return arr;
        }
        System.out.println("" + Arrays.toString(arr) + " Index " + index + " Update " + upd );
        if ( arr[index] != arr[upd]) {
            arr[upd+1]=arr[index];
            return removeDup(arr,index+1,upd+1);
        } else {
            return removeDup(arr,index+1,upd);
        }

    }



    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30};
     //   int[] arr = {10,10,10};

        int[] result = removeDup(arr,0,0);
        System.out.println(Arrays.toString(result));
    }

}
