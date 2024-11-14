class Solution {
    public String solution(String s) {
         String answer = "";
        String[] word = s.split("");
        int cnt = 0;
        for(String str : word) {
        	cnt = str.contains(" ") ? 0 : cnt+1;
    		if(cnt%2==0) {
        		answer += str.toLowerCase();
        	}else {
        		answer += str.toUpperCase();
        	}
        }
        return answer;
    }
}