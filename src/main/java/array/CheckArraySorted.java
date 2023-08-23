package array;

public class CheckArraySorted {


    private static boolean checkSort(int[] arr,int start,int next) {
        if (next == arr.length) {
            return true;
        }
        if ( arr[start] > arr[next]) {
            return false;
        }

        return checkSort(arr,start+1,next+1);
    }

    public static void main(String[] args) {
        int[] arr = {100,20,200};
        boolean result = checkSort(arr,0,1);
        System.out.println(result);
    }
}
