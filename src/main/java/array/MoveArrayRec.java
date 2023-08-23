package array;

public class MoveArrayRec {

    private void moveElements(int[] arr, int from , int to) {
        System.out.println("Moving index "+ from + " value " + arr[from] + " --> index "+ to + " value " + arr[to] );
        if ( to >= arr.length-1){
            return ;
        }
        if ( from >= arr.length-1){
            return ;
        }
        moveElements(arr,from+1,to+1);
        arr[to] = arr[from];
    }

    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        moveElements(arr,index,index+1);
        arr[index]=element;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int index = 5;
    }

}
