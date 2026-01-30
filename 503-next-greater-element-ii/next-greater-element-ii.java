class Solution {
    public int[] nextGreaterElements(int[] arr) {
      Stack<Integer> st =new Stack<>();
      int n=arr.length;
      int[] ans = new int[n];int c=0;
      for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && st.peek() <= arr[i]){
            st.pop();
        }
        int x = st.isEmpty() ? -1:st.peek();
        if(x == -1 && st.isEmpty()){
            boolean flag=true;
            for(int j=0;j<i;j++){
                if(arr[j] > arr[i]){
                    flag=false;
                    ans[i] = arr[j];
                    break;
                }
            }
            if(flag == true){ans[i] = -1;}
        }
        else{
            ans[i] = st.peek();
        }
        st.push(arr[i]);
      }
    //   for (int i = 0, j = ans.length - 1; i < j; i++, j--) { int t = ans[i]; ans[i] = ans[j]; ans[j] = t; }
       return ans;
    }
}