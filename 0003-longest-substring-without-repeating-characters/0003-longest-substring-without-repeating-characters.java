class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int l=0;
        // int r=0;int max=0;
        // HashMap<Character,Integer> map =new HashMap<>();
        // while(l < s.length() && r < s.length()){
        //     if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l){
        //         l =1+map.get(s.charAt(r));
        //     }
        //     max = Math.max(max, (r-l)+1);
        //     map.put(s.charAt(r),r);r++;
        // }
        // return max;

        int l=0;int r=0;int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(l < s.length() && r < s.length()){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l){
                 l = 1+map.get(s.charAt(r));
            }
            max = Math.max(max,(r-l)+1);
        map.put(s.charAt(r),r);r++;
        }
        return max;
    }
}