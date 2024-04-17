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
    String smallestStr=null;
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,new StringBuffer());
        return smallestStr;
    }
    private void dfs(TreeNode node,StringBuffer currentStr){
        if(node==null)
            return;
        
        currentStr.insert(0,(char)('a'+node.val));
        if(node.left==null && node.right==null)
            updateStr(currentStr.toString());
        else{
            dfs(node.left,currentStr);
            dfs(node.right,currentStr);
        }

        currentStr.deleteCharAt(0);
    }
    private void updateStr(String currentStr){
        if(smallestStr==null || currentStr.compareTo(smallestStr)<0)
            smallestStr=currentStr;
    }
}
