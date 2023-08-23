package concept;

public class PowerOfNumber {

    static int power( int n , int mid) {
        double res=1;
        while (n-- > 0) {
            res *= mid;
        }
        return (int)res;
    }


    public static void main(String[] args) {

        int main = (int) Math.pow(6,4096);
        int test = power(6,4096);
        System.out.println("test: " + test);
        System.out.println("main: " + main);
    }

}
