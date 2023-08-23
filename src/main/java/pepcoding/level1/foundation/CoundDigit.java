package pepcoding.level1.foundation;

import java.util.Scanner;

public class CoundDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(countDigit(n));
    }

    public static int countDigit(int num) {
        int count=0;
        while ( num > 0) {
            count++;
            num=num/10;
        }
        return count;
    }
}
