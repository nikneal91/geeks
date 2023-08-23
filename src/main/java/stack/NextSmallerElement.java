package stack;

import java.util.Stack;

public class NextSmallerElement {


    public static void main(String[] args) {
        int arr[] = {4 ,8 ,5 ,2 ,25};
        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for ( int i = 1; i < arr.length; i++) {
            // only line change for next greater element is st.peek < arr[i]
            while( !st.empty() && arr[st.peek()] > arr[i]) {
                res[st.pop()] = arr[i];
            }
           st.push(i);
        }
        while(!st.empty()) {
            res[st.pop()] = -1;
        }
        int j =0;
      while ( j < arr.length) {
          System.out.println("Element " + arr[j] + " Next Smaller " + res[j]);
            j++;
      }
     }
}
