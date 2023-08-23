package stack;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}

class MyStackLinked {
    Node head;
    int size;
    public MyStackLinked() {
        head = null;
        size=0;
    }

    public void push(int data) {
        Node node = new Node(data);
        if ( head==null) {
            head= node;
            head.next=null;
        }
        head.next= node;
        head=node;

    }

    public int pop() {
        Node pop = head;

        return head.data;
    }

}

public class StackUsingLinkedList {



    public static void main(String[] args) {
        MyStackLinked stack = new MyStackLinked();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
    }
}
