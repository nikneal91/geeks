package pepcoding.level1.foundation;

public class GCDandLCM {
    public static void main(String[] args) {

        int a = Util.getInt();
        int b = Util.getInt();
        System.out.println("GCD");
        int gcd = getGCD(a,b);
        System.out.println(gcd);
    }

    private static int getGCD(int a, int b) {
//        if ( a < b)
//        {
//            int temp=a;
//            a=b;
//            b=temp;
//        }
        while (b!=0) {
            int rem = a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}
