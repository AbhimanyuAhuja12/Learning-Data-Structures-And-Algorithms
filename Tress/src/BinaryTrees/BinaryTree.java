package BinaryTrees;


import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }
    private Node root;

    private static class Node {
        int value;
        Node right;
        Node left;


        public Node(int value) {
            this.value = value;
        }


    }
    public void populate(Scanner scanner){
        System.out.println("Enter the value of root node");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to insert at the left of "+node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("insert the value of element which is left of "+node.value);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to insert at the right of "+node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("insert the value of element which is right of "+node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(this.root," ");
    }
    public void display(Node node,String indent){
        if(node==null) return ;
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public void preetyDispaly(){
        preetyDispaly(root,0);
    }

    private void preetyDispaly(Node node, int level) {
        if(node==null) return;

        preetyDispaly(node.right,level+1);

        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);

        }else{
            System.out.println(node.value);
        }

        preetyDispaly(node.left,level+1);

    }

    public void preOrderTraversal() {
       inOrderTraversal(root);
    }
private void preOrderTraversal(Node node){
        if(node==null) return;
        System.out.println(node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

}

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Node node){
        if(node==null) return;
        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);

    }

    public void postOrderTraversal() {
        inOrderTraversal(root);
    }
    private void postOrderTraversal(Node node){
        if(node==null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value);

    }

}
