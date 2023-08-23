package matrix;

public class RecMatPrint {

    public static void main(String[] args) {
        int mat[][] = {{  1,   2,   3,   4},
                        {  5,   6,   7,   8},
                        {  9, 10, 11, 12},
                        {13, 14, 15, 16},
                        {17, 18, 19, 20}};

//        for (int i =0 ;i< mat.length; i++) {
//            for (int j =0 ;j < mat[i].length; j++) {
//                System.out.print(" " + mat[i][j]);
//            }
//        }
//        System.out.println();

        printRec(mat,0,0);

    }

    private static void printRec(int[][] mat, int i, int j) {

        if ( i >=2) {
            return;
        }
        if ( j>=2 ) {
            return ;
        }

        System.out.println(" LL  " + i + " " + j );
        printRec(mat,i+1,j);
        System.out.println("==========");
        printRec(mat,i,j+1);
        System.out.println("\t RR  " + i + " " + j );
    }

}
