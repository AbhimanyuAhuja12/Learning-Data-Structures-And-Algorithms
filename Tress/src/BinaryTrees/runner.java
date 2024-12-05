package BinaryTrees;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        BinaryTree tree = new BinaryTree();
////        tree.populate(scanner);
////        tree.display();
////        tree.preetyDispaly();
//
//        BST tree= new BST();
////        tree.populate(new int[]{18,20,30,23,9,5,11,17});
////        tree.isBalanced();
////        tree.display();
//
//        tree.populateSorted(new int[] {1,2,3,4,5,6,7,8,9,10});
//        tree.display();

//        AVL tree = new AVL();
//        for (int i = 0; i < 1000; i++) {
//            tree.insert(i);
//        }
//
//        System.out.println(tree.Height());\


        SegmentTree tree = new SegmentTree(new int[]{3,8,7,6,-2,-8,4,9});
//        tree.display();
        int sum_query= tree.query(2,6);
        System.out.println(sum_query);
        tree.update(3,99);
        int sum_query2=tree.query(2,6);
        System.out.println(sum_query2);

        
    }
}
