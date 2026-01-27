class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        // int m=g.length;
        int r=0;int l=0;
        while(r < g.length && l < s.length){
         if(g[r] <= s[l]){
            r++;
         }
         l++;
        }
        return r;
    }
}