package pepcoding.level1.foundation;

public class RotateNumber {
    public static void main(String[] args) {
       int n =  Util.getInt();
        int k = Util.getInt();
        int totalDigits = CoundDigit.countDigit(n);
        if ( k > totalDigits)
            k=k%totalDigits;
        if ( k < 0 )
            k=totalDigits-Math.abs(k);
        int divisor = (int)Math.pow(10,k);
        int multiplier = (int)Math.pow(10,totalDigits-k);
        System.out.println("Rotation of number " + n );
        int result = n/divisor;
        int remainder= n%divisor;
        int ans = remainder*multiplier+result;
        System.out.println(ans);
    }
}
