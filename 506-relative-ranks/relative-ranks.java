class Solution {
     static public  class sort implements Comparable<sort>{
            int val;
            int idx;
            public  sort(int idx,int val){
                this.val = val;
                this.idx = idx;
            }

            @Override
            public int compareTo(sort curr){
                return this.val - curr.val;
            }
        }
    public String[] findRelativeRanks(int[] score) {
      PriorityQueue<sort> pq = new PriorityQueue<>();
      String str[] = new String[score.length];
      for(int i = 0 ; i < score.length ; i++){
        pq.add(new sort(i,score[i]));
      }
      while(!pq.isEmpty()){
        if(pq.size() > 3){
            str[pq.remove().idx] = Integer.toString(pq.size() + 1); 
        }else if(pq.size() == 3 ){
            str[pq.remove().idx] = "Bronze Medal";
        }else if(pq.size() == 2 ){
            str[pq.remove().idx] = "Silver Medal";
        }else if(pq.size() == 1 ){
            str[pq.remove().idx] = "Gold Medal";
        }
      }
      
      return str;
    }
}