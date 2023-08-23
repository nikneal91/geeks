package pepcoding.level1.foundation;

public class PrimeFactorization {
    public static void main(String[] args) {
        int n = Util.getInt();
        printPrimeFactors(n);
    }

    private static void printPrimeFactors(int n) {
        int divisor=2;
        int num=n;
        while ( n !=1 && (divisor * divisor) <= num  ) {
            while ( n%divisor==0) {
                System.out.println(divisor);
                n=n/divisor;
            }
            divisor++;
        }
    }
}
