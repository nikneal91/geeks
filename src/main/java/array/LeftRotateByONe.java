package array;

import java.util.Arrays;

public class LeftRotateByONe {

    private static int[] rotateArr(int[] arr, int index,int rotate) {
    if ( index == arr.length)
        return arr;
        System.out.println("" + Arrays.toString(arr));
        arr[index-rotate]=arr[index];
        return rotateArr(arr,index+1,rotate);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int rotateBy = 3;
        int temp[] = new int[rotateBy];
        for ( int i =0 ;i < temp.length;i++) {
            temp[i]  = arr[i];
        }
        int[] res= rotateArr(arr,rotateBy,rotateBy);
        for ( int i =0 ;i < temp.length;i++) {
              arr[arr.length-rotateBy+i] = temp[i];
        }
        System.out.println(Arrays.toString(res));

    }
}
