class Solution {

    class DisjointSet {

        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();

        public DisjointSet(int n) {
            for (int i = 0; i < n; i++) {
                rank.add(0);
                parent.add(i);
            }
        }

        public int findupar(int node) {

            if (node == parent.get(node)) {
                return node;
            }

            int upl = findupar(parent.get(node));

            parent.set(node, upl);

            return parent.get(node);
        }

        public void unionbyrank(int u, int v) {

            int upl_v = findupar(v);
            int upl_u = findupar(u);

            if (upl_v == upl_u) {
                return;
            }

            if (rank.get(upl_u) < rank.get(upl_v)) {

                parent.set(upl_u, upl_v);

            } else if (rank.get(upl_v) < rank.get(upl_u)) {

                parent.set(upl_v, upl_u);

            } else {

                parent.set(upl_v, upl_u);

                int rankU = rank.get(upl_u);
                rank.set(upl_u, rankU + 1);
            }
        }
    }

    public int removeStones(int[][] stones) {

        int n = stones.length;

        int MAXROW = 0;
        int MAXCOL = 0;

        for (int i = 0; i < n; i++) {
            MAXROW = Math.max(MAXROW, stones[i][0]);
            MAXCOL = Math.max(MAXCOL, stones[i][1]);
        }

        DisjointSet ds =
            new DisjointSet(MAXROW + MAXCOL + 2);

        HashMap<Integer, Integer> stonenodes = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int nodeRow = stones[i][0];

            int nodeCol =
                stones[i][1] + MAXROW + 1;

            ds.unionbyrank(nodeRow, nodeCol);

            stonenodes.put(nodeRow, 1);
            stonenodes.put(nodeCol, 1);
        }

        int cnt = 0;

        for (Map.Entry<Integer, Integer> it :
             stonenodes.entrySet()) {

            if (ds.findupar(it.getKey()) == it.getKey()) {
                cnt++;
            }
        }

        return n - cnt;
    }
}