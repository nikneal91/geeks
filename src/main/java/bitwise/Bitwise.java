package bitwise;

public class Bitwise {
    public static void main(String[] args) {
      //  isOddOrEven();
        int num = 1;
        int lsb =1;
 //       boolean result = isNegtive(num);
    System.out.println("" + (lsb & (num >> 31)) );
    }

    private static boolean isNegtive(int num) {
        int number = num;
        number = number >> 31;
       // if (num >> 31)
        return false;
    }

    private static void isOddOrEven() {
        int check = (int)(Math.random()*100);
        int lsb =1;
        if ( (check&lsb) ==1) {
            System.out.println("Number is odd " + check);
        }else {
            System.out.println("Number is even " + check);
        }
    }
}
