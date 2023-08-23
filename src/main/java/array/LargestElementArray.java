package array;

public class LargestElementArray {

    private static int largestIndex(int[] arr,int index, int largest) {
       if ( index >= arr.length) {
           return largest;
       }
       if (arr[index] > arr[largest])
       {
           largest=index;
       }
       return  largestIndex(arr,index+1,largest);
    }


    public static void main(String[] args) {
    int[] arr = {40,8,50,100};
    int result = largestIndex(arr,0,0);
    System.out.println(result);
    }

}
