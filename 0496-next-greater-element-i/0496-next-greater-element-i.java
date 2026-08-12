class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map =new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int j= nums2.length-1;j >= 0;j--){
            int curr= nums2[j];
            while(!st.isEmpty() && st.peek() <= curr){
                st.pop();
            }
            int x  =st.isEmpty()?-1:st.peek();
            map.put(curr,x);
            st.push(curr);
        }
        // int[] ans =new int[nums1.length];
        //     for(int i=0;i<nums1.length;i++){
        //         ans[i] = map.get(nums1[i]);
        //     }

            int[] res =new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                res[i] = map.get(nums1[i]);
          }
        return res;
    }
    
}
