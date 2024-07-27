import java.util.Scanner;

public class inputtingLL {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedListPer list = new LinkedListPer();
        list.head=null;
        System.out.println("enter no. of elements in linkedlist");
         int n =input.nextInt();

        System.out.println("Enter the elements");
         for(int i=0;i<n;i++){
             int data=input.nextInt();
             list.head=insertData(list.head,data);
         }
         //display
        Node temp = list.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("END");

    }

    public static Node insertData(Node head, int data) {
        Node temp = new Node(data);
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

}
