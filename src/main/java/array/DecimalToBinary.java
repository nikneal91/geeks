package array;

public class DecimalToBinary {

    public static int dtbRec(int decimal, int temp,int res) {
        if ( decimal == 0 ) {
            return res;
        }
        int x=0;
        x = decimal%2 == 0? 0:1;
        System.out.println(decimal+ " "+ temp+ " "+ res);
        return dtbRec(decimal/2,temp*10,res+x*temp);
    }

    private static int dtb(int decimal) {
        int res=0;
        int temp =1;
        int x=0;
        int prev=0;
        while(decimal>0) {
        if (decimal%2 == 0) {
            x=0;
        } else {
            x=1;
        }
        res = (x * temp) + prev;
        prev= res;
        temp = temp*10;
        decimal= decimal/2;
        }
        return res;
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int result = dtbRec(number,1,0);
        System.out.println(result);
    }

}
