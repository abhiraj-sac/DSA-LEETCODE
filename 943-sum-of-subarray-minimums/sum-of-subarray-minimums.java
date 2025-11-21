
class Solution {
      static final int MOD = 1_000_000_007;

 public ArrayList<Integer> nextSmallerElements(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> next = new ArrayList<>();

        // pehle list ko size n tak bharo (placeholder)
        for (int i = 0; i < n; i++) next.add(n);  // default n

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            int idx = st.isEmpty() ? n : st.peek();
            next.set(i, idx);
            st.push(i);
        }
        return next;
    }

      public ArrayList<Integer> prevSmallerElements(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> prev = new ArrayList<>();

        for (int i = 0; i < n; i++) prev.add(-1);  // default -1

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            int idx = st.isEmpty() ? -1 : st.peek();
            prev.set(i, idx);
            st.push(i);
        }
        return prev;
    }


    public int sumSubarrayMins(int[] arr) {
       int n = arr.length;
        long t = 0;

        ArrayList<Integer> next = nextSmallerElements(arr);
        ArrayList<Integer> prev = prevSmallerElements(arr);

        for (int i = 0; i < n; i++) {
            long right = next.get(i) - i;   // kitne right side options
            long left  = i - prev.get(i);   // kitne left side options

            long contrib = (long) arr[i] * left * right;
            t = (t + contrib) % MOD;
        }

        return (int)t;
    }
}