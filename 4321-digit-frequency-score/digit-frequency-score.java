class Solution {
    public int digitFrequencyScore(int n) {
        int arr[] = new int[10];
        while(n != 0){
            arr[n % 10]++;
            n = n / 10;
        }
        int res = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                res = res + (arr[i] * i);
            }
        }
        return res;
    }
}