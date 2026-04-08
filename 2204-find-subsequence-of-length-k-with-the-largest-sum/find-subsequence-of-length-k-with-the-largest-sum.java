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

        static public  class sort2 implements Comparable<sort2>{
            int val;
            int idx;
            public  sort2(int idx,int val){
                this.val = val;
                this.idx = idx;
            }

            @Override
            public int compareTo(sort2 curr){
                return this.idx - curr.idx;
            }
        }
    public int[] maxSubsequence(int[] arr, int k) {
       PriorityQueue<sort> pq = new PriorityQueue<>();//Comparator.reverseOrder()
        for(int i=0;i<arr.length;i++){
            pq.add(new sort(i,arr[i]));
        }

        int kc = arr.length-k;
        while(kc!=0){
          pq.remove();
          kc--;
        }

        int ans[] = new int[k];
      PriorityQueue<sort2> pq2 = new PriorityQueue<>();//Comparator.reverseOrder()
     while(!pq.isEmpty()){
        pq2.add(new sort2(pq.peek().idx, pq.peek().val));
        pq.remove();
     } 
    
         for(int i=0;i<k;i++){
          ans[i] = pq2.remove().val;
         }
        return ans;
    }
}