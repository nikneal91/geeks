package matrix;

public class Start {

    private  static void print(int[] arr, int index) {
        if ( index == arr.length) {
            return;
        }
        System.out.print(" "+ arr[index]) ;
        print(arr,index+1);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        for ( int i =0 ;i < matrix.length ; i++) {
            print(matrix[i],0);
            System.out.println();
        }


    }
}
