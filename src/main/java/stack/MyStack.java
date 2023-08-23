package stack;

import java.util.ArrayList;
import java.util.List;

class MStack {
    int[] container;
    int index;
    int size;
    public MStack(int capacity) {
        this.index=-1;
        this.size=capacity;
        this.container = new int[capacity];
    }

    public void push(int x) {
        if ( index == this.size) {
            throw new RuntimeException("Stack is full ! Cannot insert elements");
        }
        container[++index] =x;
        size++;
    }

    public int pop() {
        if (index < 0) {
            throw new RuntimeException("Stack is empty! cannot remove item");
        }
        return container[index--];
    }

    public int peek() {
        if ( index < 0) {
            System.out.println("No element exists");
        }
        return container[index];
    }

    public boolean isEmpty() {
        return index==-1;
    }


}


public class MyStack {

    public static void main(String[] args) {
        MStack stack = new MStack(10);
        for ( int i=0;i< 10;i++) {
            stack.push(i+1);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        stack.pop();
    }

}
