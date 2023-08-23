package deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(10);
        deque.offerLast(20);
        deque.offerFirst(5);
        deque.offerLast(15);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

    }
}
