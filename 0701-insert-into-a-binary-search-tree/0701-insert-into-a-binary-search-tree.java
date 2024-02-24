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
    public void insert(TreeNode root,int val)
    {
        TreeNode temp = new TreeNode(val);
        if(root == null)
        {
            return;
        }
            if(root.val>val&&root.left==null)
            {
                root.left=temp;
                return;
            }
            else if(root.val<val&&root.right==null)
            {
                root.right=temp;
                return;
            }
        if(root.val>val)
        {
            insert(root.left,val);
        }
        else
        {
            insert(root.right,val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
        {
            TreeNode temp = new TreeNode(val);
            return temp;
        }
        insert(root,val);
        return root;
    }
}