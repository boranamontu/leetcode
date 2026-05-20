class Solution {
     public static class edge{
        int src;
        int dest;
        public edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }
   
   public static int NoOfProvinces(ArrayList<edge> graph[]){
        boolean visit[] = new boolean[graph.length];
        int count = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < visit.length; i++) {
              if(!visit[i]){
                q.add(i);
                bfs(graph, visit, q);
                count++;
              }
                
            }
        
        return count;

    }
    public static void bfs(ArrayList<edge>[] graph,boolean visit[],Queue<Integer> q){
        while(!q.isEmpty()){
            int curr = q.remove();
            if(visit[curr] == false){
                visit[curr]= true;
                for(int i = 0 ; i < graph[curr].size();i++){
                    if(visit[graph[curr].get(i).dest] == false){
                        q.add(graph[curr].get(i).dest);
                    }
                }
            }
        }


    }
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        ArrayList<edge> graph[] = new ArrayList[v];
        for(int i = 0 ; i < v ; i++){
            graph[i] = new ArrayList<>();
        }
        //insert
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if( isConnected[i][j] == 1  ){
                    graph[i].add(new edge(i, j));
                }
            }
        }

      return NoOfProvinces(graph);

    }   
}