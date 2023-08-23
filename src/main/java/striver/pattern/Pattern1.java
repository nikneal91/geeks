package striver.pattern;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Pattern1 {

    private static void pattern1(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void pattern3(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    private static void pattern4(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    private static void pattern5(int num) {
    for (int i = 0; i <num; i++) {
        for (int j = num-1; j >= i; j--) {
            System.out.print("*");
        }
        System.out.println();
    }


    }

    private static void pattern6(int num) {
        for (int i = num; i >0; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

    }

    private static void pattern7(int num) {
    for (int i = 0; i <num; i++) {
        int k= num-i;
        while(k-->0) {
            System.out.print(" ");
        }
        for (int j = 0; j<2*i+1; j++) {
                System.out.print("*");
            }

        System.out.println();
    }
    }

    private static void pattern8(int num) {
        for (int i = num-1; i >=0; i--) {
            int k= num-i;
            while(k-->0) {
                System.out.print(" ");
            }
            for (int j = 0; j<2*i+1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
       /* pattern1(5);
        printLine();
        pattern2(5);
        printLine();
        pattern3(5);
        printLine();
        pattern4(5);
        printLine();
        pattern5(5);
        printLine();
        pattern6(5);
        printLine();
        pattern7(9);
        printLine();
        pattern8(6);
        printLine();
        pattern9(6);
        pattern10(5);
        pattern10rec(5,0);
         pattern11(5);*/
       // pattern12(5);
      //  pattern13(5);
    Integer arr[] ={7 ,10, 4,  20, 15};
     int result =  kthLargest(arr,4);
     System.out.println(result);
    }

    private static int kthLargest(Integer[] arr, int k) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.addAll(Arrays.asList(arr));
    for ( int j=1 ;j<k;j++) {
        queue.poll();
    }
    return queue.poll();
    }


    private static int pattern13(int num) {
        if ( num == 0) {
            return 0;
        }

        int value=pattern13(num-1);
        for ( int i=1;i <=num; i++) {
            System.out.print(value + i + " ");
        }
        System.out.println();
        return value+num;
    }

    private static void pattern12(int num) {
        if ( num==0) {
            return;
        }

        pattern12(num-1);
        for ( int i=1;i<num;i++) {
            System.out.print(i);
        }
        for ( int i=1;i<=5-num;i++) {
            System.out.print("  ");
        }
        for ( int i=num-1;i>0;i--) {
            System.out.print(i);
        }
        System.out.println();
    }

    private static String pattern11(int index) {
        if ( index==0) {
         return "";
        }

        String previousPattern = pattern11(index-1);
        String result = index%2 == 0 ? "0" :"1";
        System.out.println(result + previousPattern);
        return result + previousPattern;
    }

    private static void pattern10rec(int num,int i) {
        if ( i==num) {
            return;
        }

        for ( int j=0;j<=i;j++) {
            System.out.print("*");
        }
        System.out.println();
        pattern10rec(num,i+1);
        for ( int j=0;j<=i;j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void pattern10(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern9(int num) {
        pattern7(num);
        pattern8(num);
    }

    private static void printLine() {
        System.out.println();
        System.out.println("=============================================================================================");
        System.out.println();
    }


}
