class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count =0;int presum=0;int rem=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            presum += nums[i];
            rem = presum % k;
            if(rem < 0){
                rem =rem +k;
            }
            if(map.containsKey(rem)){
                count+= map.get(rem);
                map.put(rem, map.getOrDefault(rem,0)+1);
            }
            else{
               map.put(rem,1);
            }
        }
        return count;
    }
}