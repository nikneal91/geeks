package array;

public class ComputingPower {

    private static int computeRec(int number ,int power, int result) {
        if ( power==0) {
            return result;
        }
        int temp=0;
        if ( power%2==0){
            temp=0;
        }else{
            temp=1;
            result=result*number;
        }
        System.out.println("number " + number + " power "+ power + " result " + result);
        return computeRec(number*number,power/2,result);
        }



    private static int compute(int number,int power) {
        if (power==0) {
            return 1;
        }
        System.out.println("number "+ number+ " power " + power);
        return compute(number,power-1)*number;
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int power = Integer.parseInt(args[1]);
      //  int result = compute(number,power);
        int result2 = computeRec(number,power,1);
     //   System.out.println(result);
        System.out.println(result2);

    }
}
