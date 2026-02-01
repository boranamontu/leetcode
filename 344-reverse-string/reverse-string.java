class Solution {
    public void reverseString(char[] str) {
        int i=0;
        int j=str.length-1;
        while(i<=j){
            if(i==j){
                return;
            }
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
    }
}