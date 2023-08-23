package pepcoding.level1.foundation;

public class PrintZ {

    public static void main(String[] args) {
        int n=5;
        for (int i=0; i<n ; i++) {
            if ( i==0 || i==n-1) {
                System.out.println("*****");
            } else {
                for (int j=0;j<n-i-1;j++)
                    System.out.print(" ");
                System.out.println("*");
            }

        }

    }
}
