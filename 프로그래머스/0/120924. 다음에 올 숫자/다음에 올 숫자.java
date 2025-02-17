class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int diff = common[1] - common[0];

        boolean isDiff = true;

        for(int i = 0; i < common.length - 1; i++){
            if(common[i+1] - common[i] != diff){
                isDiff = false;
            }
        }
        if(isDiff){
           answer = common[common.length - 1] + diff;
        }else{
            answer = common[common.length - 1] * common[1]/common[0];
        }
        return answer;
    }
}