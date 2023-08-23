package array;

public class SecondLargestIndex {
    private static int secondLargestIndex(int[] arr,int index, int largest,int secondLarge) {
        if ( index >= arr.length) {
            System.out.println("RESULT "  +
                    " largest " + largest +
                    " value " + arr[largest] +
                    " second " + secondLarge +
                    " value " + arr[secondLarge] );
            return secondLarge;
        }
        System.out.println("index " + index +
                " value " + arr[index] +
                " largest " + largest +
                " value " + arr[largest] +
                " second " + secondLarge +
                " value " + arr[secondLarge] );

        if (arr[index] > arr[largest])
        {
            secondLarge=largest;
            largest=index;
        }
        else if (arr[index] ==arr[largest]) {

        }

        else if(arr[index] > arr[secondLarge] ) {
                    secondLarge= index;
        }

        return  secondLargestIndex(arr,index+1,largest,secondLarge);
    }


    public static void main(String[] args) {
        int[] arr = {20,10,20,8,12};
        int first = -1;
        int second = -1;
        if ( arr[0] > arr[1]) {
            first=0;
            second=1;
        }else {
            first=1;
            second=0;
        }
        int result = secondLargestIndex(arr,2,first,second);
        System.out.println(result);
    }

}
