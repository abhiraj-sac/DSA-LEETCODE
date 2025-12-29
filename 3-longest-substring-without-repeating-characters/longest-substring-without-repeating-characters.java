class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;int r=0;int max=0;int len=0;
        while(r< s.length()){
            if(map.containsKey(s.charAt(r))){
                 if(map.get(s.charAt(r)) >= l){
                    l = map.get(s.charAt(r))+1;
                 }
            }
                len = r-l+1;
                max = Math.max(len,max);
                map.put(s.charAt(r), r);
                r++;
            }
            return max;
        }
        
    }
