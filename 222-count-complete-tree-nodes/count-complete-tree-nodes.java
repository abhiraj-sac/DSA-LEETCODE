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
    public int countNodes(TreeNode root) {
        ArrayList<Integer> list =new ArrayList<>();
        Queue<TreeNode> q =new LinkedList<>();
        if(root == null){return list.size();}
        q.offer(root);
        list.add(root.val);
        while(!q.isEmpty()){
             int size = q.size();
             for(int i=0;i<size;i++){
             if(q.peek().left != null){q.offer(q.peek().left);list.add(q.peek().left.val);}
             if(q.peek().right != null){q.offer(q.peek().right);list.add(q.peek().right.val);}
             q.poll();
             }

        }
        return list.size();
    }
}