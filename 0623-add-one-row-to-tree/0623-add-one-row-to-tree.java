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
    public void dfs(TreeNode root,int depth,int val,int d)
    {
        if(root==null) return;
        if(depth<d-1)
        {
            dfs(root.left,depth+1,val,d);
            dfs(root.right,depth+1,val,d);
        }
        else
        {
            TreeNode tmp = root.left;
            root.left = new TreeNode(val);
            root.left.left = tmp;
            tmp = root.right;
            root.right = new TreeNode(val);
            root.right.right = tmp;
        }
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }
        dfs(root,1,val,depth);
        return root;
    }
}