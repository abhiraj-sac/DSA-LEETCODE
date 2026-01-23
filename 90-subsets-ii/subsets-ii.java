class Solution {
    public static void fun(int ind, int[] arr, int n, HashSet<ArrayList<Integer>> set, ArrayList<Integer> list1) {
    if(ind == n){
        set.add(new ArrayList<>(list1));
        return;
    }
        //    pick
        list1.add(arr[ind]);
        fun(ind+1,arr,n,set,list1);
        //    not pick
        list1.remove(list1.size() - 1);
        fun(ind+1,arr,n,set,list1);
    }
    public List<List<Integer>> subsetsWithDup(int[] arr) {
          Arrays.sort(arr); 
       HashSet<ArrayList<Integer>> set = new HashSet<>();
       int n=arr.length;
       ArrayList<Integer> list1 = new ArrayList<>();
        fun(0,arr,n,set,list1);
        List<List<Integer>> ans = new ArrayList<>();
        for (ArrayList<Integer> l : set) {
            ans.add(l);
        }

        return ans;
    }
}