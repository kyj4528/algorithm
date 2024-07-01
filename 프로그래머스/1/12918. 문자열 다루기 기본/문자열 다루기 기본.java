class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6){
            answer = false;
        }else{
            int cnt = 0;
            for(int i=0; i<s.length(); i++){
                cnt = 0;
                for(int j=0; j<10; j++){
                    if(j == (s.charAt(i) -'0')){
                        cnt++;
                    }
                }
                if(cnt != 1){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}