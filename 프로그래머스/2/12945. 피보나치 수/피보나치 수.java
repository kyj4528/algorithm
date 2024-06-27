class Solution {
    public int solution(int n) {
        int ze = 0;
        int fi = 1;
        int answer = 0;
        for(int i=2; i<=n; i++){
            answer = ze + fi;
            ze = fi;
            fi = answer;
            ze %= 1234567;
            fi %= 1234567;
            answer %= 1234567;
        }
        
        return answer;
    }
    
}