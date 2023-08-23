package array;

import java.net.BindException;
import java.util.Arrays;

public class LeaderArray {

    private static int[] findLeaders(int[] arr, int end, int leader, int[] result,int index) {
        if (end < 0) {
            return result;
        }
        if ( arr[end]> leader) {
            leader=arr[end];
            result[index]=leader;
            index++;
        }
        return findLeaders(arr,end-1,leader,result,index);
    }

    public static void main(String[] args) {
       // int[] arr = {7,10,4,10,6,5,2};
//        int[] arr = {10,20,30};
        int[] arr = {30,20,10};

        int[] res = new int[arr.length];
        Arrays.fill(res,-1);
        res = findLeaders(arr,arr.length-1,-1,res,0);
        System.out.println(Arrays.toString(Arrays.stream(res).filter(i->i!=-1).toArray()));
     }


}
