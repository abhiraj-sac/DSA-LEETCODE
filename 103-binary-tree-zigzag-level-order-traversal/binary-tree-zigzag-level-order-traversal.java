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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> finals = new LinkedList<List<Integer>>();
        if (root == null) return finals;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); int c=0;
        while(!q.isEmpty()){
           
            int size = q.size();
            ArrayList<Integer> list= new ArrayList<>();
            for(int i=0;i<size;i++){
                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }
                list.add(q.poll().val);
            }
            if(c%2 !=0){
                    Collections.reverse(list);
                    finals.add(list);
                }
            else{
                finals.add(list);
            }
            c++;
        }
        return finals;
    }
}