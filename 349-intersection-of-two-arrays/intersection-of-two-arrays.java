class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        int j=0;
        int[] n = new int[Math.min(nums1.length, nums2.length)];
        for(int i=0;i<nums2.length;i++){
           if(map.containsKey(nums2[i])){
            n[j++] = nums2[i];
            map.remove(nums2[i]);
           }
        }
        return Arrays.copyOfRange(n, 0, j);
    }
}