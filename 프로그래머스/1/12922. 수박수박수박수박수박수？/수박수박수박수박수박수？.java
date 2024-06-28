class Solution {
    public String solution(int n) {
        String answer = "";
        while(n!=0){
            if(n/2>0){
                answer+="수박";
                n-=2;
            }else{
                answer+="수";
                n--;
            }
        }
        return answer;
    }
}