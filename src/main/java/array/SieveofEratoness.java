package array;

import java.util.Arrays;

public class SieveofEratoness {

    private  static boolean[] isPrime;
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        isPrime = new boolean[number];
        Arrays.fill(isPrime,true);
        for (int i =2 ; i*i<=number;i+=2) {
            if(isPrime[i]){
                for(int j=2*i;j<=number;j=j+i) {
                    isPrime[j]=false;
                }
            }
        }

    }
}
