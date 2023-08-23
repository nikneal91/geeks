package array;

public class GCD {

    private  static int gcdEuclied(int a , int b) {
        if ( a==b) {
            return a;
        }
        if ( a > b) {
            return gcdEuclied(a-b, b);
        }else {
            return gcdEuclied(a,b-a);
        }
    }

    private  static int gcd(int a,int b,int result) {
        if (result==1){
            return result;
        }
        if ( a%result ==0 && b%result==0) {
            return result;
        }
        return gcd(a,b,result-1);
    }

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int res=0;
        if (number1<number2) {
            res =number1;
        }else{
            res=number2;
        }
        int result = gcd(number1,number2,res);
        int result2 = gcdEuclied(number1,number2);
        int lcm = (number1*number2)/result;
        System.out.println(result+" " + result2+ " "+ lcm);
    }
}
