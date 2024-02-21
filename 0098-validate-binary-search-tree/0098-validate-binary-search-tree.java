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
    boolean flag = true;
    int prev,c=0;
    public void help(TreeNode root)
    {
        if(root == null)
        {
            return ;
        }
        help(root.left);
        if(c!=0&&prev>=root.val)
        {
            flag=false;
        }
        else
        {
            c++;
            prev = root.val;
        }
        help(root.right);

    }
    public boolean isValidBST(TreeNode root) {
        help(root);
        return flag;
    }
}