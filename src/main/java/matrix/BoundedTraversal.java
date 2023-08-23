package matrix;

public class BoundedTraversal {


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        if (matrix.length==1) {
            for ( int i =0 ;i < matrix[0].length;i++){
                System.out.print(matrix[0][i]);
            }
        }

        if (matrix[0].length==1) {
            for ( int i =0 ;i < matrix[0].length;i++){
                System.out.print(matrix[0][i]);
            }
        }


        printTopToRight(matrix[0],0);
        printRightToBottom(matrix,1);
        printBottomLeft(matrix[matrix.length-1],matrix[matrix.length-1].length-2);
        printLeftToTop(matrix,matrix.length-2);
    }

    private static void printLeftToTop(int[][] matrix, int index) {
        if ( index <= 0) {
            return;
        }
        System.out.print(" "+ matrix[index][0]);
        printLeftToTop(matrix,index-1);
    }

    private static void printRightToBottom(int[][] matrix, int row) {
        if (row == matrix.length) {
            return;
        }
        System.out.print(" " + matrix[row][matrix[row].length-1]);
        printRightToBottom(matrix,row+1);
    }

    private static void printTopToRight(int[] matrix, int start) {
        if (start >= matrix.length) {
            return;
        }
        System.out.print(" " + matrix[start]);
        printTopToRight(matrix,start+1);
    }

    private static void printBottomLeft(int[] matrix,int end) {
        if (end < 0) {
            return;
        }
        System.out.print(" " + matrix[end]);
        printBottomLeft(matrix,end-1);
    }

}