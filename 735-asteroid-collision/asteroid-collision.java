class Solution {
    public int[] asteroidCollision(int[] arr) {
    Stack<Integer> st = new Stack<>();int n=arr.length;
    // Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && arr[i] > 0 && st.peek() < 0 && arr[i] > Math.abs(st.peek())){
                st.pop();
            }
            if(!st.empty() && arr[i] > 0 && st.peek() < 0 && arr[i] == Math.abs(st.peek())){
                st.pop();continue;
            }
            if(!st.empty() && arr[i] > 0 && Math.abs(st.peek()) > arr[i] && st.peek() < 0){
                continue;
            }
            st.push(arr[i]);
        }
        int[] ans = new int[st.size()];int c=0;
        while(!st.isEmpty()){
            ans[c++] = st.pop();
        }
        return ans;
}
}