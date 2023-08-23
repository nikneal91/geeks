package array;

import java.sql.SQLOutput;

public class TrailingZero {

    private static int countTrailingZero(int number,int count) {
        if ( number==0){
            return count;
        }
        return countTrailingZero(number/5,count+(number/5));
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int result = countTrailingZero(number,0);
        System.out.println(result);
    }
}
