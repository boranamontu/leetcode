class Solution {
    public int singleNumber(int[] arr) {
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
        int count = 1;
        int val = arr[i];
        i++;
        while(i != arr.length && val == arr[i]){
        count++;
        i++;
       }i--;
        if(count == 1){
        return val;
       }
      
     }
       return-1;
    }
}