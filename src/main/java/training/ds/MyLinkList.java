package training.ds;

interface MyLinkList {
    void insert(int data);
    void insertAtPosition(int pos,int data);
    void delete();
    int deletePosition(int pos);
    void sort();
    void reverse();
    int size();
    int center();
    void print();
}


class MyLinkedList implements MyLinkList {
    private Node head;
    private int size;
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data =data;
            this.next = null;
        }
    }

    public MyLinkedList()  {
        this.head =null;
    }

    public int size() {
        return this.size;
    }

    @Override
    public void insert(int data) {
        if ( head == null) {
            head = new Node(data);
        }else {
            Node last = head;
            while(last.next!=null) {
                last = last.next;
            }
            last.next = new Node(data);
        }
        this.size++;
    }

    @Override
    public void insertAtPosition(int pos, int data) {
        int index=0;
        Node insertIndex = head;
        while(index++ < pos-1) {
            insertIndex=insertIndex.next;
        }
        Node newNode = new Node(data);
        newNode.next= insertIndex.next;
        insertIndex.next=newNode;
        this.size++;
    }

    @Override
    public void delete() {
        if (head==null) {
            System.out.println("Linklist is empty");
            return;
        }
        if ( head.next == null) {
            System.out.println("Deleted head " + head.data);
            head = null;
            this.size--;
            return;
        }
        Node deleteLast = head;
        Node prevLast = head;
        while(deleteLast.next !=null) {
            prevLast = deleteLast;
            deleteLast = deleteLast.next;
        }
        prevLast.next=null;
        System.out.println("Deleted Element : " + deleteLast.data);
        this.size--;
    }

    @Override
    public int deletePosition(int pos) {
       return this.size--;
    }

    @Override
    public void sort() {

    }

    @Override
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next =null;
        while ( curr!=null) {
           next  = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
        }
        head=prev;
    }

    @Override
    public int center() {
        if (head == null ) {
            System.out.println("Empty linked list no center element");
            return -1;
        }
        Node fast = head;
        Node slow =head;
        while (fast!=null && fast.next!=null) {
            fast= fast.next.next;
            slow=slow.next;
        }
      return slow.data;
    }

    @Override
    public void print() {
        Node index = head;
        while(index != null) {
            System.out.println(index.data);
            index = index.next;
        }
    }

}