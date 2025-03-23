package Questions;

public class InvertTree {

      public static class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
              this.left = left;
              this.right = right;
         }
      }

// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//           return  convertTree(root);
//     }
//     private static TreeNode convertTree(TreeNode node){
//         if(node==null) return null;

//         convertTree(node.left);
//         convertTree(node.right);

//         TreeNode curr = node.left;
//         node.left=node.right;
//         node.right=curr;



//         return node;
//     }
// }


        public TreeNode invertTree(TreeNode root) {
            if(root==null) return null;

            TreeNode left=invertTree(root.left);
            TreeNode right = invertTree(root.right);

            root.left=right;
            root.right=left;

            return root;

    }
}
