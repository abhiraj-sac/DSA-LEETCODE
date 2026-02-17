class Solution {
    // class Pair{
    //     int row;
    //     int col;
    //     Pair(int _row,int _col){
    //         this.row = _row;this.col =_col;
    //     }
    // }
     void dfs(int row,int col,int[][] ans,int[][] image,int[] dr,int[] dc,int color,int in){
        ans[row][col]= color;
        int n=ans.length;int m=ans[0].length;
        for(int i=0;i<4;i++){
            int r= row+dr[i];
            int c=col+dc[i];
            if(r >= 0 && r < n && c >= 0 && c < m && ans[r][c] != color && image[r][c] == in){
               dfs(r,c,ans,image,dr,dc,color,in);
            }

        }
     } 
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    //     Queue<Pair> q = new LinkedList<>();
    //     int n=image.length;int m=image[0].length;
    //     int[][] vis=new int[n][m];
       int in= image[sr][sc];
    //     image[sr][sc]  =color;
    //     q.add(new Pair(sr,sc));
    //     vis[sr][sc] =1;
        int[] drow={-1,0,+1,0};
        int[] dcol={0,+1,0,-1};
        int[][] ans=image;
        dfs(sr,sc,ans,image,drow,dcol,color,in);
    //     while(!q.isEmpty()){
    //         Pair curr=q.poll();
    //         int r=curr.row;
    //         int c=curr.col;
    //         for(int i=0;i<4;i++){
    //             int nrow = r+drow[i];
    //             int ncol =c+dcol[i];
    //             if(nrow >= 0 && nrow <n && ncol >=0&& ncol<m && vis[nrow][ncol] == 0  && image[nrow][ncol]==in){
    //                 vis[nrow][ncol] =1;
    //                 image[nrow][ncol] = color;
    //                 q.add(new Pair(nrow,ncol));
    //             }
    //         }
    //     }
    //     return image;
    return ans;
    }
}