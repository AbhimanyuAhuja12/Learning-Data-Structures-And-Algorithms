package BinaryTrees;

public class AVL {
    public class Node{
        private int value;
        private Node right;
        private Node left;
        private int height;

        public Node(int value){
            this.value=value;
            this.height=1;
        }
    }
    private Node root;
    public AVL(){

    }

    public int getValue(Node node){
        if(node==null) return -1;
        return node.value;
    }
    public int Height(){
        return getHeight(root);
    }

    private int getHeight(Node node){
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

        return rotate(node);
    }

    private Node rotate(Node node){
        if(getHeight(node.left)-getHeight(node.right)>1){
           //left heavy
            if(getHeight(node.left.left)-getHeight(node.left.right)>0){
                // left-left case
                return rightRotate(node);
            }
            if(getHeight(node.left.left)-getHeight(node.left.right)<0){
                // left-Right case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(getHeight(node.left)-getHeight(node.right)<-1){
            //Right heavy
            if(getHeight(node.right.left)-getHeight(node.right.right)<0){
                // right-right case
                return leftRotate(node);
            }
            if(getHeight(node.right.left)-getHeight(node.right.right)>0){
                // right-left case
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node leftRotate(Node p) {
        Node c=p.right;
        Node t=c.left;

        c.left=p;
        p.right=t;


        c.height=Math.max(getHeight(c.left),getHeight(c.right))+1;
        p.height=Math.max(getHeight(p.left),getHeight(p.right))+1;

        return c;
    }

    private Node rightRotate(Node p) {
        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;

        c.height=Math.max(getHeight(c.left),getHeight(c.right))+1;
        p.height=Math.max(getHeight(p.left),getHeight(p.right))+1;

        return c;
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

