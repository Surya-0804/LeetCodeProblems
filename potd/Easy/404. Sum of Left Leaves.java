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
    private static int leftSum(TreeNode root, int direction){
        if(root==null)
            return 0;
        int sum=0;
        if(root.left==null && root.right==null && direction==-1)
            return root.val;
        sum+=leftSum(root.left,-1);
        sum+=leftSum(root.right,1);

        return sum;

    }
    public int sumOfLeftLeaves(TreeNode root) {
        return leftSum(root,0);
    }
}
