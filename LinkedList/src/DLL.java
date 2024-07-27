public class DLL {

    private Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        if(head!=null) {
            head.prev = node;
        }
        node.prev=null;

        head=node;
    }

    public void display(){
        Node temp =head;

        while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void diplayRev(){
        System.out.println("Display in Reverse");
        Node tail = head;
        if(tail==null) return;

        while(tail.next!=null){
            tail=tail.next;
        }
        while(tail!=null){
            System.out.print(tail.value + "->");
            tail=tail.prev;
        }
        System.out.println("END");
    }


    public void insertLast(int value) {
        Node node = new Node(value);
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        Node tail = head;
        while (tail.next != null) {
           tail=tail.next;
        }
        tail.next=node;
        node.prev=tail;

    }

    public Node find(int val){
        Node node =head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void insert(int after,int value){
        Node p =find(after);

        if(p==null){
            System.out.println("can't insert");
            return;
        }
        Node node = new Node(value);

        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }


    }





    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
