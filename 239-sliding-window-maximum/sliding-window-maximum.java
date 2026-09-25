class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer> q = new ArrayDeque<>();     
          if(k==1){return nums;}
        int[] ans = new int[nums.length-k+1];int itr=0;
        int i=0;int j=0;
        while(j < nums.length){
            while(q.size() > 0 && nums[j] > q.peekLast()){
                q.removeLast();
            }
            q.addLast(nums[j]);
            if((j-i+1) < k){
                j++;
            }
            else if((j-i+1) == k){
              ans[itr++] = q.peekFirst();
              if(nums[i] == q.peekFirst()){
                q.removeFirst();
              }
              i++;j++;
            }
        }
        return ans;
    }
}