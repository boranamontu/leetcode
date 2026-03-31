class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        for(int i=0;i<operations.length;i++){
            if("+".equals(operations[i]) && !s.isEmpty()){
                int first = s.pop();
                int sec = s.peek();
                s.push(first);
                s.push(first + sec);
                sum = sum + s.peek();
            }else if("D".equals(operations[i]) && !s.isEmpty()){
                s.push(s.peek() * 2);
                sum = sum + s.peek();
            }else if("C".equals(operations[i]) && !s.isEmpty()){
                sum = sum - s.pop();
            }else if(!"+".equals(operations[i]) && !"D".equals(operations[i]) && !"C".equals(operations[i])){
                s.push(Integer.valueOf(operations[i]));
                sum = sum + s.peek();
            }
        }
        return sum;
    }
}