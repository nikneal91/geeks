package array;

import static java.util.Arrays.parallelSort;

public class Segregate {

    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,1};
        print(arr);
       // segregate(arr);
       segregate2(arr);
        System.out.println();
       print(arr);

    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static void segregate2(int[] arr) {
        int right=arr.length-1;
        int left=0;
        while (left < right) {
            while (left < arr.length && arr[left] == 0 ) {
                left++;
                //do nothing
            }
            while ( right> 0 && arr[right] == 1 ) {
                right--;
            }
            if ( right!=0 && left!=arr.length ) {
                swap(arr,left, right);
                left++;
                right--;
            }
            }
        }



    private static void segregate(int[] arr) {
        int rtPtr=arr.length-1;
        int i=0;
        while (i < rtPtr) {
            if ( arr[i] == 0 ) {
                i++;
                //do nothing
            } else{
                while(rtPtr > 0 && arr[rtPtr]==1){
                    rtPtr--;
                }
                swap(arr,i, rtPtr);
            }
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
