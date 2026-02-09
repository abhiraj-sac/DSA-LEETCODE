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
    public void help(TreeNode root, ArrayList<Integer> l){
        if(root == null){return;}
        help(root.left,l);
        l.add(root.val);
        help(root.right,l);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        help(root,l);
        return l;
    }
}