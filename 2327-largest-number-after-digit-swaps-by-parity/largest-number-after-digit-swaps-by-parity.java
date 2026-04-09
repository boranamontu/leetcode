class Solution {

    // public static int larger(PriorityQueue<Integer> epq,PriorityQueue<Integer> opq,int num){
    //     if(num == 0){
    //         return 0;
    //     }




    // }
    public int largestInteger(int num) {
        PriorityQueue<Integer> epq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> opq = new PriorityQueue<>(Comparator.reverseOrder());
        Deque<Integer> dq = new  LinkedList<>();

        // return larger(epq,opq,num);
         int last = 0;
        while(num != 0){
            int dig = num % 10;
            if(dig % 2 == 0){
                epq.add(dig);
            }else{
                opq.add(dig);
            }
            num = num /10;
            last = dig;
            dq.addFirst(dig);
        }
        int ans = 0;
        while(!dq.isEmpty()){
        if(dq.getFirst() % 2 == 0){
            
                if(!epq.isEmpty()){
                    ans = ans + epq.remove();
                    if(!opq.isEmpty() || !epq.isEmpty()){
                        ans = ans * 10;
                    }
                }
        }else{
                if(!opq.isEmpty()){
                    ans = ans + opq.remove();
                     if(!opq.isEmpty() || !epq.isEmpty()){
                        ans = ans * 10;
                     }
                }
        }
        dq.removeFirst();
        }

      return ans;
    }
}