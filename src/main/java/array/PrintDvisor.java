package array;

public class PrintDvisor {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        for ( int i =1 ;i*i<=number ;i++) {
                if (number%i==0) {
                    System.out.println(i);
                    if ( i!=number/i){
                        System.out.println(number/i);
                    }
                }
        }
    }
}
