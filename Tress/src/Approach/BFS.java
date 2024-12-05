package Approach;

import BinaryTrees.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST tree = new BST();
        tree.populate(new int[]{20,15,25,14,16,21,26});
        System.out.println(BreadthFirstSearch(tree));
        System.out.println(findSucessor(tree,16));
    }

    public static ArrayList<ArrayList<Integer>> BreadthFirstSearch(BST tree){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Queue<BST.Node> queue = new LinkedList<BST.Node>();

        queue.add(tree.root);
        while(!queue.isEmpty()){
            int levelSize= queue.size() ;
            ArrayList<Integer> LevelList= new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                BST.Node currNode= queue.poll();
                LevelList.add(currNode.value);

                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }
            }
            list.add(LevelList);
        }



        return list;
    }

    public static int findSucessor(BST tree,int key){
        Queue<BST.Node> queue = new LinkedList<>();
        queue.add(tree.root);
        if(tree.root==null) return -1;

        while(!queue.isEmpty()){
            BST.Node currentNode =queue.poll();
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
            if(currentNode.value==key && queue.peek() != null) {
                    return queue.peek().value;
            }
        }

        return -1;
    }
}
/*
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        return BreadthFirstSearch(root);
    }

    public static List<List<Integer>> BreadthFirstSearch(TreeNode root){

        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize= queue.size() ;
            ArrayList<Integer> LevelList= new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode= queue.poll();
                if(currNode!=null){
                LevelList.add(currNode.val);
                }

                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }
            }
            list.add(LevelList);
        }



        return list;
    }
}
*/


