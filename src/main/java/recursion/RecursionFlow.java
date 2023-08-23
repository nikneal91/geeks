package recursion;

public class RecursionFlow {

    static int global = 0;


    public static void main(String[] args) {
       int n=5;
        printRootLeftRight(n);
        System.out.println("final " + global);

    }

    private static int printRootLeftRight(int i) {
        if ( i == 0 || i ==10)  {
            return 0;
        }
       // global+=i;
        int left = printRootLeftRight(i-1);
      //  global=0;
      //  global+=i;
         int right = printRootLeftRight(i-1);
     //   global=0;
     //   global+=i;
        global = Math.max (left,right);
        return i;
    }
}
