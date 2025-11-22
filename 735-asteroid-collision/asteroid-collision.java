class Solution {
    public int[] asteroidCollision(int[] arr) {
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
        if (  arr[i] > 0 || st.isEmpty()) {
            st.push(arr[i]);
        
        }
        
        else {

//        else if(arr[i] > st.peek()){st.push(arr[i]);}
                while (!st.isEmpty() && st.peek() + arr[i] < 0 && st.peek() > 0) {
                    st.pop();
                }
            
             if (!st.isEmpty() && st.peek() + arr[i] == 0) {
                    // both destroyed
                    st.pop();
                }
               else if (st.isEmpty() || st.peek() < 0) {
                st.push(arr[i]);
            }
            
        }
    }
       List<Integer> rems = new ArrayList<>();
        while (!st.isEmpty()) {
            rems.add(st.pop());
        }

        Collections.reverse(rems);

        return rems.stream().mapToInt(i -> i).toArray();

}
}