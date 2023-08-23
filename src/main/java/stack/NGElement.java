package stack;

import java.util.Stack;

/**
 * Most popular next greater element and its variations
 */
public class NGElement {

    public static void main(String[] args) {
        int[] arr = new int[]{ 20, 30,10,25,15, 12,16};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        System.out.println("element " + arr[0] + " previous greater " + -1);
        for ( int i =1 ;i < arr.length; i++) {

            while (!stack.isEmpty() &&  stack.peek() <= arr[i]) {
                stack.pop();
            }
            int pg = stack.isEmpty() ? -1 : stack.peek();
            System.out.println("element " + arr[i] + " previous greater " + pg);
            stack.push(arr[i]);
        }

    }
}
