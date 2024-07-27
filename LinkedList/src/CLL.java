public class CLL {
    Node head;
    Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + "->");
                if (temp.next != null) {
                    temp = temp.next;
                }
            } while (temp != head);
        }
        System.out.println();
    }

    public Node find(int value) {
        Node temp = head;
        while (temp.value != value) {
            temp = temp.next;
        }
        return temp;
    }

    public void insertionAfter(int after, int value) {
        Node node = new Node(value);
        Node p = find(after);
        node.next = p.next;
        p.next = node;

    }

    public void delete(int value) {
        Node node = head;
        if (head == null) {
            return;
        }

        if (head == tail && head.value==value){
            head = null;
            tail = null;
            return;
        }

        if (node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
