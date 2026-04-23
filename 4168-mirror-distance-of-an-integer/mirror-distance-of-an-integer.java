class Solution {
    public int mirrorDistance(int n) {
       int num = n;
       int ans = 0;
       while(num != 0){
        int res = num % 10;
        ans = ans *10 + res;
        num = num/10;
       }
       return Math.abs(n - ans);
    }
}