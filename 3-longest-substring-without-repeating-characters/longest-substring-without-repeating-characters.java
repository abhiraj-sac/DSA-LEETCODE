class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int r=0;int l=0;int n=s.length();int len=0;int m=0;
        while(r < n){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r)) >= l){
                    l= 1+ map.get(s.charAt(r));
                }
            }
                len=r-l+1;
                m = Math.max(m,len);
                map.put(s.charAt(r),r);
                r++;
            }
            return m;
        }
        
        }
