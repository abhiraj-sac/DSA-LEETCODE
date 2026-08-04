class Solution {

    class Tuple {
        int distance;
        int row;
        int col;

        Tuple(int distance, int row, int col) {
            this.distance = distance;
            this.row = row;
            this.col = col;
        }
    }

    public int minimumEffortPath(int[][] heights) {

        int n = heights.length;
        int m = heights[0].length;

        PriorityQueue<Tuple> pq = new PriorityQueue<>(
            (x, y) -> x.distance - y.distance
        );

        int[][] dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], (int) 1e9);
        }

        dist[0][0] = 0;
        pq.offer(new Tuple(0, 0, 0));

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while (!pq.isEmpty()) {

            Tuple it = pq.poll();

            int diff = it.distance;
            int row = it.row;
            int col = it.col;

            if (row == n - 1 && col == m - 1)
                return diff;

            for (int i = 0; i < 4; i++) {

                int newr = row + dr[i];
                int newc = col + dc[i];

                if (newr >= 0 && newr < n &&
                    newc >= 0 && newc < m) {

                    int newEffort = Math.max(
                        Math.abs(heights[row][col] - heights[newr][newc]),
                        diff
                    );

                    if (newEffort < dist[newr][newc]) {

                        dist[newr][newc] = newEffort;

                        pq.offer(new Tuple(newEffort, newr, newc));
                    }
                }
            }
        }

        return 0;
    }
}