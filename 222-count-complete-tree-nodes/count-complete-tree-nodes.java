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
        list.add(root.val);int count=0;
        while(!q.isEmpty()){
             int size = q.size();
             for(int i=0;i<size;i++){
                count++;
             if(q.peek().left != null){q.offer(q.peek().left);}
             if(q.peek().right != null){q.offer(q.peek().right);}
             q.poll();
             }

        }
        return count;
    }
}