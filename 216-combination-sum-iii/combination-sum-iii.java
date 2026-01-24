class Solution {
    public void helper(int ind,int tar,int[] arr,int size,List<Integer> list
    ,List<List<Integer>> ans){
        if(tar == 0 && size == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if (tar < 0 || size < 0 || ind == arr.length){return;}
        list.add(arr[ind]);
        // pick
        helper(ind+1,tar-arr[ind],arr,size-1,list,ans);
        list.remove(list.size()-1);
        // not pick
        helper(ind+1,tar,arr,size,list,ans);

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        int[] arr= {1,2,3,4,5,6,7,8,9};
        int tar = n;int size=k;
        helper(0,tar,arr,size,list,ans);
        return ans;
    }
}