class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int n = nums.length;
        int[] res = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> st = new Stack<>();              

        
        for (int j = n - 1; j >= 0; j--) {
            int curr = nums[j];

            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            int nextGreater = st.isEmpty() ? -1 : st.peek();
            
            if (nextGreater == -1 && st.isEmpty()) {
                for (int i = 0; i < j; i++) {
                    if (nums[i] > curr) {
                        nextGreater = nums[i];
                        break; 
                    }
                }
            }
            map.put(j, nextGreater);
            st.push(curr);
        }
        for (int i = 0; i < n; i++) {
            res[i] = map.get(i);
        }
        return res;
    }
}