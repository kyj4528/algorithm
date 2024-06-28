class Solution {
    public String solution(int n) {
        String answer = "";
        while(n!=0){
            if(n/2>0){
                for(int i=0; i<n/2; i++){
                    answer +="수박";
                }
                n -= (n/2)*2;
            }else{
                answer+="수";
                n--;
            }
        }
        return answer;
    }
}
