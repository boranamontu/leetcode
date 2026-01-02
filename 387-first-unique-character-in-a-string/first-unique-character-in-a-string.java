import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> sidx=new LinkedList<>();//string index
        Queue<Integer> mappidx=new LinkedList<>();//map index
        int map[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int mapidx=(int)ch-97;
            map[mapidx]++;
            sidx.add(i);
            mappidx.add(mapidx);
        }
        while(map[mappidx.peek()]!=1){
            sidx.remove();
            mappidx.remove();
           if(sidx.isEmpty()){
            return -1;
        } 
        }
        
        
            return sidx.peek();
     
    }
}