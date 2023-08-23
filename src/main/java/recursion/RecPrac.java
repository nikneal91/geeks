package recursion;

public class RecPrac {

    public static void main(String[] args) {
      //  printNameNTimes(5, "Nikhil");
      //  printNameNTimesAlter(5, "Nikhil",1);
        print1toN(1);

    }

    private static void print1toN(int N) {
        if ( N > 5) {
            return ;
        }
        System.out.print(N+" ");
        print1toN(N+1);
    }

    private static void printNameNTimesAlter(int times, String name, int index) {
        if ( index > times ) {
            return ;
        }
        System.out.println(name);
        printNameNTimesAlter(times,name,index+1);
    }

    private static void printNameNTimes(int times,String name) {
    if ( times ==0 ) {
        return ;
    }
    System.out.println(name);
    printNameNTimes(times-1,name);



    }
}
