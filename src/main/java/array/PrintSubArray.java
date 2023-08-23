package array;

public class PrintSubArray {

    private static void printSub(char[] arr, int index, int len) {
        if ( index  > arr.length-1) {
          return;
        }
        if ( len  > arr.length) {
            return;
        }
        int j = len;
        int i = index;
        System.out.println();
        while ( j > 0) {
            System.out.print(arr[i] + " ");
            i= ((i+1)%arr.length);
            j--;
        }
        printSub(arr,index+1,len+1);

    }

    public static void main(String[] args) {
        char[] arr = {'a','b','c'};

        //for (int i =0;i < arr.length;i++) {
        printSub(arr, 0, 1);
      //  printSub(arr,1, 2);
        //}

    }
}
