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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        rightview(root,arr,0);
        return arr;
    }
    public void rightview(TreeNode root,List<Integer> arr,int size)
    {
        if(root==null)
        {
            return ;
        }
        if(size==arr.size())
        {
            arr.add(root.val);
        }
        rightview(root.right,arr,size+1);
        rightview(root.left,arr,size+1);
    }
}