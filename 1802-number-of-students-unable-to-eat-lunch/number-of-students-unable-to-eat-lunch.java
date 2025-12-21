import java.util.*;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu=new LinkedList<>();
        Queue<Integer> sand=new LinkedList<>();
      
        for(int i=0;i<students.length;i++){
               stu.add(students[i]);
               sand.add(sandwiches[i]);
        }
        while(!stu.isEmpty()){
            if(stu.peek()==sand.peek()){
                stu.remove();
                sand.remove();
                
            }else if(stu.peek()!=sand.peek()){
                  int count=students.length;
                 while(stu.peek()!=sand.peek()){
                    if(count==-1){
                        int j=0;
                        while(!stu.isEmpty()){
                            stu.remove();
                            j++;
                        }
                        return j;
                    }
                    int copy=stu.peek();
                    stu.remove();
                    stu.add(copy);
                    count--;
                 }
            }
        }
                         int j=0;
                        while(!stu.isEmpty()){
                            stu.remove();
                            j++;
                        }
                        return j;
    }
}