public class LL {
   private Node head;
   private Node tail;
   private int size;

   public LL(){
       this.size=0;
   }

   //Inserting Element
   public void insertFirst(int value){
       Node node = new Node(value);
       node.next=head;
       head=node;

       if(tail==null){
           tail=head;
       }
       size+=1;
   }

   //Displaying
    public void display(){
       Node temp =head;

       while(temp!=null){
           System.out.print(temp.value + "->");
           temp=temp.next;
       }
        System.out.println("END");
    }

    //Insert at End
    public void insertEnd(int value){
        if(tail==null){
            insertFirst(value);
        }
       Node node = new Node(value);
       tail.next=node;
       tail=node;
       size+=1;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertEnd(value);
            return;
        }
        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
        Node node =new Node(value, prev.next);
        prev.next=node;

        size++;
    }


       public int deleteFirst(){
           int val=head.value;
           head=head.next;
           if(head==null){
               tail=null;
           }
           size--;
           return val;

        }

        public Node get(int index){
          Node node = head;
          for(int i=0;i<index;i++){
              node=node.next;
          }
          return node;
        }


    public int deleteLast(){
       int val =tail.value;
       if(size<=1){
           return deleteFirst();
       }
       Node secondLast =get(size-2);
       tail=secondLast;
       tail.next=null;

       return val;
        }

    public int delete(int index){
       if(index==0){
           return deleteFirst();
       }
       if(index==size-1){
           return deleteLast();
       }
       Node prev=get(index-1);
       int val =prev.next.value;
       prev.next=prev.next.next;

       return val;
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

    // insert using recursion
    public void insertRec(int value,int index){

       head= insertRec(value,index,head);
    }

    private Node insertRec(int value,int index,Node node){
      if(index==0){
          Node temp = new Node(value,node);
          size++;
          return temp;
      }
      node.next=insertRec(value,index-1,node.next);
      return node;
    }

    public static LL mergeList(LL List1, LL List2){
       Node p = List1.head;
       Node s =List2.head;

       LL ans = new LL();

       while(p!=null && s!=null){
           if(p.value<=s.value) {
               ans.insertEnd(p.value);
               p = p.next;
           }else{
                   ans.insertEnd(s.value);
                   s=s.next;
               }
           }
       while(p!=null){
           ans.insertEnd(p.value);
           p=p.next;
       }
       while(s!=null){
           ans.insertEnd(s.value);
           s=s.next;
       }
       return ans;
    }
    public void bubbleSort(){
       bubbleSort(size-1,0);
    }

    public void bubbleSort(int row, int col){
        if(row==0) return;

        if(row>col){
            Node first = get(col);
            Node second =get(col+1);


            if(first.value>second.value) {

                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;

                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;

                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }

                bubbleSort(row, col + 1);
            }
            else{
            bubbleSort(row-1,0);
        }

    }
    public void reverse(){
       reverse(head);
    }

    public void reverse(Node node){
       if(node==tail){
           head=tail;
           return;
       }
       reverse(node.next);
       tail.next=node;
       tail=node;
       tail.next=null;
    }







    public class Node{
        int value;
        Node next;

       public Node(int value)
       {
           this.value=value;
        }
        public Node(int value,Node next){
           this.value=value;
           this.next=next;
        }
    }
}
