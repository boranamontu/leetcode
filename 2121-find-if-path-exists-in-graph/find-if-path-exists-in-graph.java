class Solution {
    public static class edge{
        int src;
        int dest;
        public edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void bfs(ArrayList<edge> graph[],boolean visit[],Queue<Integer> q,int des){
       
        while(!q.isEmpty()){
             if(q.peek() == des){
            return;
            }
            int curr = q.remove();
            System.out.println(curr);
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
    public static boolean haspath(ArrayList<edge> graph[],int src,int dest){
        boolean visit[] = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        bfs(graph, visit, q,dest);
        if(q.isEmpty()){
            return false;
        }
        return q.peek() == dest;
                
                
            
        

    }

    public boolean validPath(int n, int[][] edges, int src, int des) {
        // if(edges.length == 1 || edges.length == 0){
        //     return true;
        // }
        ArrayList<edge> graph[] = new ArrayList[n];
        for(int i = 0 ; i < graph.length;i++){
            graph[i] = new ArrayList<>();
        }
       
            for(int i = 0 ; i < edges.length ; i++){
           
                graph[edges[i][0]].add(new edge(edges[i][0], edges[i][1])); 
                graph[edges[i][1]].add(new edge(edges[i][1], edges[i][0]));
                
            }
            
       return haspath(graph, src, des);
        
    }
}