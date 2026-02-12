class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map  =new HashMap<>();
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);

                boolean hashset =new  HashSet<>(map.values()).size() ==1;
            if(hashset == true){max = Math.max(max,(j-i+1));}
            }
            
        }
        return max;
    }
}