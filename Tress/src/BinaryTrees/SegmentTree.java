package BinaryTrees;

public class SegmentTree {

    private static class Node{

        int startInterval;
        int endInterval;
        int data;
        Node right;
        Node left;

        public Node(int startInterval,int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }

    }
    Node root;

    public SegmentTree(int[]arr){
        this.root= ConstructTree(arr,0,arr.length-1);
    }

    private Node ConstructTree(int[] arr,int start,int end) {
       if(start==end){
           Node leaf=new Node(start,end);
           leaf.data=arr[start];
           return leaf;
       }

       Node node= new Node(start,end);

       int mid=(start+end)/2;

       node.left=ConstructTree(arr,start,mid);
       node.right=ConstructTree(arr,mid+1,end);

       node.data= node.left.data + node.right.data;

       return node;
    }

    public void display(){
             display(this.root);
    }
    private void display(Node node){
        String str="";

        if(node.left!=null){
            str=str+ "Interval=[" + node.left.startInterval+"-"+ node.left.endInterval+ "] and data : "+node.left.data +"=>  ";
        }else{
            str=str+" Does not have Left child ";
        }

        str=str+ "Interval=[ " + node.startInterval+"-"+ node.endInterval+ "] and data :  "+node.data +"  <= ";

        if(node.right!=null){
            str=str+ "Interval=[" + node.right.startInterval+"-"+ node.right.endInterval+  " ] and data : "+node.right.data;
        }else{
            str=str+" Does not have Right child ";
        }

        System.out.println(str + "\n");

        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }


    //query
    public int query(int qsi,int qei){
        return  this.query(this.root,qsi,qei);
    }

    private int query(Node node,int qsi,int qei){

        //completely lie inside
          if(node.startInterval>=qsi && node.endInterval<=qei){
              return node.data;
          }

          //outside the interval
        else if(node.startInterval>qei || node.endInterval<qsi){
            return 0;
          }

          //overlapping
        else{
             return this.query(node.left,qsi,qei)+this.query(node.right,qsi,qei);
          }

    }

    //update
    public void update(int index,int value){
        this.root.data=update(this.root,index,value);
    }

    private int update(Node node , int index ,int value){
        if(index<=node.endInterval && index>=node.startInterval){
            if(index==node.endInterval && index==node.startInterval){
                node.data=value;
                return node.data;
            }
            else {
                node.data= this.update(node.left, index, value) + this.update(node.right, index, value);
                return node.data;
            }
        }
        return node.data;
    }
}
