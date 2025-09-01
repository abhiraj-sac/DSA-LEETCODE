class Solution {
    public int[] twoSum(int[] arr, int t) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        int[] a = new int[2];
        for(int i=0;i<arr.length;i++){
                if(map.containsKey(t-arr[i])){
                    a[0]=map.get(t-arr[i]);
                    a[1] = i;
                }
                    map.put(arr[i],i);
        }
        return a;
    }
}