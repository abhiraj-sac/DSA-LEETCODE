class Solution {
    public static void dfs(int i,ArrayList<ArrayList<Integer>> list,boolean vis[] ){
        vis[i] =true;
        for(Integer it:list.get(i)){
            if(vis[it] == false){
                dfs(it,list,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int v = isConnected.length;
        boolean vis[] =new boolean[v];
        for(int i=0;i<vis.length;i++){
            list.add(new ArrayList<Integer>());
        }
        // change matrix to adj list 
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if (isConnected[i][j] == 1 && i != j) {
            list.get(i).add(j);
            list.get(j).add(i);
        }
            }
        }
        int c =0;
        for(int i=0;i<vis.length;i++){
            if(vis[i] == false){
                c++;
                dfs(i,list,vis);
            }
        }
        return c;
    }
}