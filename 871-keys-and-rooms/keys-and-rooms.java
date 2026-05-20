class Solution {
     public static int NoOfProvinces(List<List<Integer>> rooms){
        boolean visit[] = new boolean[rooms.size()];
        int count = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < visit.length; i++) {
              if(!visit[i]){
                q.add(i);
                bfs(rooms, visit, q);
                count++;
              }
                
            }
        
        return count;

    }
    public static void bfs(List<List<Integer>> rooms,boolean visit[],Queue<Integer> q){
        
        while(!q.isEmpty()){
            int curr = q.remove();
            if(visit[curr] == false){
                
                visit[curr]= true;
                for(int i = 0 ; i < rooms.get(curr).size();i++){
                    
                    if(visit[rooms.get(curr).get(i)] == false){
                        q.add(rooms.get(curr).get(i));
                    }
                    
                    
                }
            }
        }


    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        return NoOfProvinces(rooms) == 1;

    }
}