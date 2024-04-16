/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
            return addRow(root,val,depth,1);
    }
    private static TreeNode addRow(TreeNode root,int val, int depth,int current){
        if(depth==1){
            TreeNode temp=new TreeNode(val);
            temp.left=root;
            return temp;
        }
        if(root==null){
            return root;
        }
        if(current==depth-1){
            TreeNode left=root.left;
            TreeNode right=root.right;
            root.left=new TreeNode(val);
            root.right=new TreeNode(val);
            root.left.left=left;
            root.right.right=right;
            return root;
        }
        addRow(root.left,val,depth,current+1);
        addRow(root.right,val,depth,current+1);
        return root; 
    }
}
