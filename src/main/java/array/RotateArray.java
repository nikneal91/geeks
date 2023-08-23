package array;

/**
 * Rotate array by d position using temp array.
 */
public class RotateArray {


    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        int rotateBy = 3;
        printArray(arr);
        rotateArray(arr, rotateBy);
        printArray(arr);

    }

    private static void rotateArray(int[] arr, int rotateBy) {
        // create a temporary array
        int[] temp = new int[rotateBy];
        for ( int i = 0 ; i < rotateBy; i++) {
            temp[i] = arr[i];
        }
        // swap arr by d positions
        for (int j = 0; j < arr.length-rotateBy; j++) {
            arr[j] = arr[j+rotateBy];
        }
        for ( int k = 0; k < rotateBy; k++) {
            arr[arr.length-rotateBy+k] = temp[k];
        }

    }

    private static void printArray(int[] arr ) {
        for ( int x : arr) {
            System.out.print(" " + x);
        }
        System.out.println();
    }

}
