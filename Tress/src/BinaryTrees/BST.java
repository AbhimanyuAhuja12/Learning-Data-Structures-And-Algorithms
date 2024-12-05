package BinaryTrees;

public class BST {
    public class Node{
        public int value;
        public Node right;
        public Node left;
        private int height;

        public Node(int value){
            this.value=value;
            this.height=1;
        }
    }
    public Node root;
    public BST(){

    }

    public int getValue(Node node){
        if(node==null) return -1;
        return node.value;
    }

    public int getHeight(Node node){
        if(node==null) return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int value){
     root=insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
            node= new Node(value);
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }

        node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;

        return node;
    }

    public void isBalanced(){
         isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node==null) return true;

        return Math.abs(getHeight(node.left)-getHeight(node.right))<=1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void populate(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            insert(arr[i]);
        }
    }

    public void populateSorted(int[]arr){
        populateSorted(arr,0,arr.length-1);
    }

    private void populateSorted(int[]arr,int start, int end){
        if(start>end) return;

        int mid =(start+end)/2;
        this.insert(arr[mid]);
        populateSorted(arr,start,mid-1);
        populateSorted(arr,mid+1,end);
    }


    public void display(){
        display(root,"Root node :");
    }

    private void display(Node node,String details){
        if(node==null) return;
        System.out.println(details+node.value);
        display(node.left,"left child of "+node.value+" : ");
        display(node.right," Right child of "+node.value+" : ");

    }



}
