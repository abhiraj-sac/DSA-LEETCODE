class Solution {

    class Tuple {
        int dist;
        int row;
        int col;

        Tuple(int dist, int row, int col) {
            this.dist = dist;
            this.row = row;
            this.col = col;
        }
    }

    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;

        // Source ya Destination blocked hai
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;

        // Single Cell
        if (n == 1)
            return 1;

        int[][] dist = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], (int)1e9);
        }

        Queue<Tuple> q = new LinkedList<>();

        dist[0][0] = 1;
        q.offer(new Tuple(1, 0, 0));

        int[] dr = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};

        while (!q.isEmpty()) {

            Tuple it = q.poll();

            int dis = it.dist;
            int r = it.row;
            int c = it.col;

            for (int i = 0; i < 8; i++) {

                int newr = r + dr[i];
                int newc = c + dc[i];

                if (newr >= 0 && newr < n &&
                    newc >= 0 && newc < n &&
                    grid[newr][newc] == 0 &&
                    dis + 1 < dist[newr][newc]) {

                    dist[newr][newc] = dis + 1;

                    if (newr == n - 1 && newc == n - 1)
                        return dis + 1;

                    q.offer(new Tuple(dis + 1, newr, newc));
                }
            }
        }

        return -1;
    }
}