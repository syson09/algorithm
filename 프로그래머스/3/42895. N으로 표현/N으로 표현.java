import java.util.*;

class Solution {
    public int solution(int N, int number) {
        Set<Integer>[] setArray = new HashSet[9]; // 9개의 set을 담는 배열 만들기
        for(int i = 1; i < 9; i++){
            setArray[i] = new HashSet<>();
            String repeatData = Integer.toString(N).repeat(i);
            setArray[i].add(Integer.parseInt(repeatData));
            
            for(int j = 1; j < i; j++){
                for(int op1 : setArray[j]){
                    for(int op2 : setArray[i-j]){
                        setArray[i].add(op1 + op2);
                        setArray[i].add(op1 - op2);
                        setArray[i].add(op1 * op2);
                        if(op2 != 0){
                            setArray[i].add(op1 / op2);
                        }
                    }
                }
               
            }
            
             if(setArray[i].contains(number)){
                return i;
                }
        }

       return -1;
    }
   
}