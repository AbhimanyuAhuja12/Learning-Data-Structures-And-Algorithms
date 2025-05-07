package LinkedList;

public class AddLast {
    class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;
        Node tail;
        int size = 0;

        public void addLast(int val) {
            Node newNode = new Node(val);
            if (size == 0) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }
    }

    public static void main(String[] args) {


        AddLast outer = new AddLast();
        LinkedList inner = outer.new LinkedList();

        inner.addLast(55);
        inner.addLast(45);

    }
}
