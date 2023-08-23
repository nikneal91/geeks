package array;

import java.util.Arrays;

public class SpanSum {

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 0, 0, 0};
        int[] arr2 = {1, 0, 1, 0, 0, 1};
        int result = longestSpanSum(arr1,arr2);
        System.out.println("result " + result);


    }

    /**
     * The idea is to get difference at each index and store in auxilary array,
     * then traverse through the aurxilary array from ends to get the first occurence
     * where diffSum = 0;
     * @param arr1 - array one
     * @param arr2 = array two
     * @return
     */
    private static int longestSpanSum(int[] arr1, int[] arr2) {
     int[] aux = diffSum(arr1,arr2);
     int begin = 0;
     int end = aux.length-1;

     while ( begin < end) {
         if ( aux[begin] == aux[end]) {
             System.out.println("Index from  " + begin + " to " + end );
             return end-begin+1;
         }
         begin++;
         end--;
     }
     return -1;
    }

    private static int[] diffSum(int[] arr1, int[] arr2) {
        int[] aux = new int[arr1.length];
        int prevSum =0;
        for ( int i = 0 ; i < arr1.length; i++) {
            aux[i] = arr1[i] - arr2[i] + prevSum;
            prevSum= aux[i];
        }
        System.out.println(Arrays.toString(aux));
        return aux;
    }

}
