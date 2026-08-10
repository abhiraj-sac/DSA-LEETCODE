class Solution {
    class DisjointSet{
        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();
        public DisjointSet(int n){
            for(int i=0;i<n;i++){
            rank.add(0);
            parent.add(i);
            }
        }
        public int findupar(int node){
            if(node == parent.get(node)){return node;}
            int upl = findupar(parent.get(node));
            parent.set(node,upl);
            return parent.get(node);
        }
        public void unionbyrank(int u,int v){
            int upl_u = findupar(u);
            int upl_v = findupar(v);
            if(upl_u == upl_v){return ;}
            if(rank.get(upl_u) < rank.get(upl_v)){
                parent.set(upl_u,upl_v);
            }
            else if(rank.get(upl_v) < rank.get(upl_u)){
                parent.set(upl_v,upl_u);
            }
            else{
                parent.set(upl_v,upl_u);
                int rankU = rank.get(upl_u);
                rank.set(upl_u,upl_u+1);
            }
        }
    }
    public int makeConnected(int n, int[][] edges) {
        DisjointSet ds = new DisjointSet(n);
        int cntextras = 0;
        int m =edges.length;
        for(int i=0;i<m;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            if(ds.findupar(u) == ds.findupar(v)){
                cntextras++;
            }
            else{
                ds.unionbyrank(u,v);
            }
        }
        int ctc=0;
        for(int i=0;i<n;i++){
            if(ds.parent.get(i) == i){ctc++;}
        }
        if(cntextras >= ctc-1){return ctc-1;}
        return -1;
    }
}