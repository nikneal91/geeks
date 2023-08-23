package array;

import java.util.Arrays;

public class MoveZeroEnd {

    private static int[] moveEnd(int[] arr, int index, int nonZero,int[] res) {
        if (arr.length == index)
            return res;
        System.out.println(Arrays.toString(arr) + " <-- "+index+" --> " + Arrays.toString(res));
        if ( arr[index]!=0) {
             res[nonZero] = arr[index];
            return moveEnd(arr,index+1,nonZero+1,res);
        }
        return moveEnd(arr,index+1,nonZero,res);
    }

    public static void main(String[] args) {
        int[] arr = {8,5,0,10,0,20};
        int[] rest = new int[arr.length];
        int[] res = moveEnd(arr,0,0,rest);
        System.out.println(Arrays.toString(res));

    }

}
