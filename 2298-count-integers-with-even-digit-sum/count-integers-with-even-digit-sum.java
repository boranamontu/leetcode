class Solution {
    public int countEven(int num) {
        int count = 0;
       
            while(num != 0){
                int sum = 0;
                int n = num;
                while(n != 0){
                    sum = sum + (n % 10);
                    n = n / 10;
                }
                if(sum % 2 == 0){
                    count++;
                }
                num  = num - 1;
                
            }
                return count;
    }
}