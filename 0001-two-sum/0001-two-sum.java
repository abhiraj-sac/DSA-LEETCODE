class Solution {
    public int[] twoSum(int[] arr, int tar) {
        // HashMap<Integer,Integer> map =new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(tar-arr[i])){
        //         return new int[]{map.get(tar-arr[i]) , i};
        //     }
        //     else{
        //         map.put(arr[i],i);
        //     }
        // }
        // return new int[0];


        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(tar-arr[i])){
                return new int[]{map.get(tar-arr[i]),i};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[0];
    }
}