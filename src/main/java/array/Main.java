package array;

public class Main {

    private static int countDigits(int number) {
        if ( number == 0)
            return 0;
        return 1+countDigits(number/10);
    }
//Checked Exception and UncheckExceptions
  static  int check() {
            throw new RuntimeException();
    }

    public static void main(String[] args) {
    //int number = Integer.parseInt(args[0]);
    //int result = countDigits(number);
    //System.out.println(result);
        System.out.println(check());



    }
}
