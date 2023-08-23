package matrix;

public class SnakePattern {

    private static void printBack(int[] matrix,int end) {
        if (end < 0) {
            return;
        }
        System.out.print(" " + matrix[end]);
        printBack(matrix,end-1);
    }

    private static void printFwd(int[] matrix,int start) {
        if (start==matrix.length) {
            return;
        }
        System.out.print(" " + matrix[start]);
        printFwd(matrix,start + 1);
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for ( int i =0 ; i< matrix.length;i++) {
            if ( i%2 == 0) {
                printFwd(matrix[i], 0);
            } else {
                System.out.println();
                printBack(matrix[i],matrix[i].length-1);
                System.out.println();
            }
        }
    }
}
