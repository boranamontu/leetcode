class Solution {
    public static class sort implements Comparable<sort>{
        int idx;
        int val;

        public sort(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
        
        @Override
        public int compareTo(sort curr){
            if(this.val == curr.val){
                return this.idx - curr.idx;
            }
            return this.val - curr.val;
        }
    }
    public static List<List<Integer>> divide(PriorityQueue<sort> pq,List<List<Integer>> ll1){
        List<Integer> ll2 ;
        while(!pq.isEmpty()){
            ll2 = new ArrayList<>();
           int idx = pq.peek().idx;
           int val = pq.peek().val;
           int count = val;
           
           while(!pq.isEmpty() && pq.peek().val == val && count != 0){
            
            ll2.add(pq.remove().idx);
            
            count--;
           }
           ll1.add(ll2);
           
        }
        return ll1;
    }
    public List<List<Integer>> groupThePeople(int[] sizes) {
        PriorityQueue<sort> pq = new PriorityQueue<>();
       for(int i = 0 ; i < sizes.length; i++){
           pq.add(new sort(i, sizes[i]));
       }
       List<List<Integer>> ll1 = new ArrayList<>();
       
       return divide(pq,ll1);
        
    }
}