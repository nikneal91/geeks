package pepcoding.level1.foundation;

public class PrintDigit {
    public static void main(String[] args) {
        int n = Util.getInt();
     //   printDigit(n);
        printDigitIterative(n);
        printRev(n);
    }

    private static void printRev(int n) {
        System.out.println("Reverse of a number " + n);
        while ( n >0) {
            System.out.println(n%10);
            n=n/10;
        }
    }

    private static void printDigitIterative(int n) {
        while ( n > 0) {
            int digit = CoundDigit.countDigit(n);
            int div = (int)Math.pow(10,digit-1);
            System.out.println(n/div);
            n=n%div;
        }
    }

    private static void printDigit(int n) {
        if ( n <=0)
            return ;
        printDigit(n/10);
        System.out.println(n%10);

    }
}
