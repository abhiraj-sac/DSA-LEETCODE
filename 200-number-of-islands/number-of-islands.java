class Solution {
    public static void dfs(int row,int col,int[] delrow,int[] delcol,char grid[][],int vis[][]){

        for(int i=0;i<4;i++){
            vis[row][col]=1;
            int n=grid.length;
            int m=grid[0].length;
            int nrow=row + delrow[i];
            int ncol =col + delcol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol <m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0){
                dfs(nrow,ncol,delrow,delcol,grid,vis);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]= new int[n][m];
        int c=0;
        int delrow[] ={-1,0,+1,0};
        int delcol[] ={0,+1,0,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                     if(grid[i][j] == '1' && vis[i][j] == 0){
                        vis[i][j]=1;
                        c++;
                        dfs(i,j,delrow,delcol,grid,vis);
                    }
            }
        }
        return c;
    }
}