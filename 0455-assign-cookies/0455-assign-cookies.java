class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);int l=0;int r=0;int c=0;
        while(r < g.length && l < s.length){
            if(g[r] <= s[l]){
                c++;r++;l++;
            }
            else if(g[r] > s[l]){
                l++;
            }
        }
        return c;
    }
}