package LinkedList;

public class DisplayLinkedList {
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

        public int size(){
            return size;
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {


        DisplayLinkedList outer = new DisplayLinkedList();
        LinkedList inner = outer.new LinkedList();

        System.out.println(inner.size());
        inner.addLast(55);
        inner.addLast(45);
        System.out.println(inner.size());
        inner.display();

    }
}
