class Solution {
    public void sortColors(int[] arr) {
        for(int i = 0 ;  i < arr.length;i++){
        for(int j = 0;j< arr.length;j++){
             if(j != arr.length-1 && arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }
       }
    }
}