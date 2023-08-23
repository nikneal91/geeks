package pepcoding.level1.foundation;

public class PyTriplet {
    public static void main(String[] args) {
        int a = Util.getInt();
        int b = Util.getInt();
        int c = Util.getInt();
        int hypo = Math.max(c,Math.max(a,b));
        boolean flag = false;
        if( a==hypo) {
            flag = (b*b)+(c*c)==(a*a);
        } else if ( b==hypo) {
            flag = (a*a)+(c*c)==(b*b);
        } else {
            flag = (a*a)+(b*b)==(c*c);
        }
        System.out.println("Pythagorean triplet "+ flag);
    }
}
