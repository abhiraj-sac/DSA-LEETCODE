class Solution {
    class Pair implements Comparable<Pair> {
    int node;
    int time;

    Pair(int node, int time){
        this.node = node;
        this.time = time;
    }

    @Override
    public int compareTo(Pair other){
        return this.time - other.time;   // min-heap based on time
    }
}
    public int networkDelayTime(int[][] times, int n, int k) {
ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
for(int i = 0; i <= n; i++){
    adj.add(new ArrayList<>());
}
for(int[] edge : times){
    int u = edge[0];
    int v = edge[1];
    int w = edge[2];

    adj.get(u).add(new Pair(v, w)); 
}
    PriorityQueue<Pair> q = new PriorityQueue<>((a,b) -> a.time - b.time);
    int dist[] = new int[n+1];
    for(int i=0;i<n+1;i++) {
        dist[i] = (int)(1e9);
    }  
    dist[k] = 0;
    dist[0] =0;
    q.add(new Pair(k,0));
    while(!q.isEmpty()){
      Pair it = q.peek();
      int node = it.node;
      int time = it.time;
      q.remove();
      for(Pair iter:adj.get(node)){
        int adjnode = iter.node;
        int edw = iter.time;
        if(time + edw < dist[adjnode]){
            dist[adjnode] = time+edw;
            q.add(new Pair(adjnode,time+edw));
        }
      }
    }
    int max=-1;
       for(int i=0;i<n+1;i++){
        if(dist[i] == (int)1e9){return -1;}
        else{
            if(max < dist[i]){
                max = dist[i]; 
            }
        }
      }
      return max;
    }
}