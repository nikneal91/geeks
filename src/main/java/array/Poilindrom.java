package array;

public class Poilindrom {

    private static int reverse(int number , int temp) {
        if (number==0)
            return temp;
        return reverse(number/10,(temp*10)+number%10);
    }


    private static boolean isPailindrom(int number) {
        System.out.println(reverse(number,0));
        return (number==reverse(number,1));
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        boolean result = isPailindrom(number);
        System.out.println(result);
    }
}
