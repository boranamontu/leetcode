class Solution {
   public static class edge{
        int src;
        int dest;
        edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    } 
    public static boolean bipartite(ArrayList<edge> graph[]){
        int visit[] = new int[graph.length];
         for(int i = 0 ; i < graph.length ; i++){
            visit[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        
         for(int i = 0 ; i < visit.length ; i++){
           if(visit[i] == -1){
            
             q.add(i);
             visit[i] = 1;
             boolean notify = bfs(graph,q,visit);
             if(notify == false){
                
                return false;
             }
           }
        }
        
        return true;
    }
    public static boolean bfs(ArrayList<edge> graph[],Queue<Integer> q,int visit[]){
        while(!q.isEmpty()){
            int curr = q.remove();
        
            
                for(int i = 0 ; i < graph[curr].size();i++){
                    if(visit[graph[curr].get(i).dest] == visit[curr]){
                        
                        return false;
                    }
                    if(visit[graph[curr].get(i).dest] != visit[curr]  ){
                        
                        if(visit[graph[curr].get(i).dest] == -1){
                            q.add(graph[curr].get(i).dest);
                            if(visit[curr] == 0){
                                visit[graph[curr].get(i).dest] = 1;
                            }else{
                                visit[graph[curr].get(i).dest] = 0;
                            }
                        }
                       

                    }
                }
            
        }
        return true;
    }
     public static void insert(ArrayList<edge> graph[], int[][] edges){
    for(int i = 0; i < edges.length; i++){
        for(int j = 0; j < edges[i].length; j++){
            graph[i].add(new edge(i, edges[i][j]));
        }
    }
}
    public boolean isBipartite(int[][] edges) {
        ArrayList<edge> graph[] = new ArrayList[edges.length];
        for(int i = 0 ; i < graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        insert(graph,edges);
        return bipartite(graph);
    }
}