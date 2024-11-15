class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == ' ') {
        		answer += " ";
        	}else if('a'<= s.charAt(i) && 'z' >= s.charAt(i)) {
        		answer += (char)('a' + (s.charAt(i)+n-'a')% 26);
        	}else {
        		answer += (char)('A' + (s.charAt(i)+n-'A')% 26);
        	}
        }
        return answer;
    }
}