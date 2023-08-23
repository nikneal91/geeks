package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest sub array sum kadance algorithm
 */
public class LSSum {

    public static void main(String[] args) {
        int k = 15;
        int[] input = {10,5,2,7,1,9};
        int[] prefixSum = new int[input.length];
        Map<Integer,Integer> mapOfSumIndex = new HashMap<>();
        mapOfSumIndex.put(0,-1);
        int sum=0;
        int result= Integer.MIN_VALUE;
        // running sum
        // then if sum-k exists already then we have answer as [index of sum] , index of [sum-k]
        for (int kx=0;kx<input.length; kx++) {
             prefixSum[kx] += input[kx];
        }

        for ( int mx =0 ; mx<prefixSum.length ; mx++ ) {
        }


        for (int i =0 ; i < input.length; i++) {
            sum += input[i];
            if (mapOfSumIndex.containsKey(sum-k)) {
                System.out.println("Answer is " +i+ " " + mapOfSumIndex.get(sum-k) + " " + (i -mapOfSumIndex.get(sum-k)));
                for ( int j=mapOfSumIndex.get(sum-k)+1;j<=i; j++)
                System.out.print(" " + input[j]);
                System.out.println();
                result = Math.max(result, (i -mapOfSumIndex.get(sum-k)));
            }else {
                mapOfSumIndex.put(sum,i);
            }
        }
    if ( result == Integer.MIN_VALUE )
        System.out.println("No value exists");
    else
        System.out.println("Result is " + result);
    }
}
