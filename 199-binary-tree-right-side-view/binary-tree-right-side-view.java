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
// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         if(root == null){return ans;}
//         Queue<TreeNode> q = new LinkedList<>();
//         q.offer(root);
//         while(!q.isEmpty()){
//             int n = q.size();
//             for(int i=0;i<n;i++){
//                 TreeNode curr = q.poll();
//                 if(i == n-1){
//                 ans.add(curr.val);
//             }
//             if(curr.left != null){q.offer(curr.left);}
//             if(curr.right != null){q.offer(curr.right);}
            
//             }
            
//         }
//         return ans;
//     }
// }


class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lists  = new ArrayList<>();
        int currdepth=0;
        helper(root,lists,currdepth);
        return lists;
    }
    public void helper(TreeNode root, List<Integer> lists,int currdepth){
       if(root == null){return;}
       if(currdepth == lists.size()){
        lists.add(root.val);
       }
       helper(root.right,lists,currdepth+1);
       helper(root.left,lists,currdepth+1);
    }
}