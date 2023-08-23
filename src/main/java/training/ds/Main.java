package training.ds;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.insertAtPosition(2,12);
      /*  list.delete();
        list.delete();
        list.delete();
        list.delete();
        list.delete();
      */
        System.out.println("Center element is : " + list.center());
        System.out.println("Size of linked list : " +list.size());
        list.print();
        list.delete();
        System.out.println("============================");
        list.reverse();
        list.print();
    }
}
