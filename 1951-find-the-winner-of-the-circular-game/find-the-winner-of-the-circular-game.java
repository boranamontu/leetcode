class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1 ; i <= n ; i++){
            q.add(i);
        }
        while(!q.isEmpty() && q.size() != 1){
            int count = k-1;
            while(count != 0){
                q.add(q.remove());
                count--;
            }
            q.remove();
        }
        return q.peek();

    }
}