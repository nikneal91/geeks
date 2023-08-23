package array;

public class PrefixSuffixSum {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int prefixSum=0;
        int suffixSum=0;
        int leftSum=0;
        int rightsum=0;
        int current=0;
        int n= arr.length;
        int totalSum = n*(n+1)/2;
        // equillibrium point
        for ( int i=0; i < arr.length; i++) {
            prefixSum+=arr[i];
            leftSum +=arr[i];
            current=arr[i];
            rightsum=totalSum-leftSum;
            System.out.println("prefixSum" + " "  + prefixSum + " rightsum " + rightsum + " leftsum " + leftSum + "current" + current);
        }
        System.out.println("");
        for ( int j=n-1; j>=0; j-- ) {
            suffixSum+=arr[j];
            System.out.print(suffixSum  + " ");
        }


    }
}
