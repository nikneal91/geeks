package array;

import java.util.Arrays;

public class PrintRangeOrSingle {

    private static void printSeens(boolean[] elements) {
       int begin =0;
       int current =0;
       int end=-1;
       while(current++ < elements.length-1) {

           if ( elements[current] == false ) {

           } else {
               print(begin ,(current - 1));
               begin= current+1;
           }
       }

       if ( begin != current ) {
           print(begin, (current - 1));
       }


    }

    private static void print(int begin,int end) {
        if (begin != end) {
            System.out.println(begin+"-"+end);
        }else {
            System.out.println(begin);

        }
    }


    public static void main(String[] args) {
        boolean[] elements = {false, false, true, false, true};
        printarray(Arrays.toString(elements));
        printSeens(elements);

    }

    private static void printarray(String toStringe) {
        System.out.println(toStringe);
    }
}
