class Solution {
    public String solution(String s) {
        char[] chars = s.toLowerCase().toCharArray();
		String answer= "";
		 for(int i=0; i<chars.length; i++) {
			 if(' ' != chars[i] && (chars[i] < '0' || chars[i] > '9')) {
                 if(i==0 || (' ' == chars[i-1] && ' ' != chars[i])){
						chars[i] = (char)(chars[i] - 'a' + 'A');
				 }
			 }
		 }
		 
		answer = String.valueOf(chars); 
		return answer;
    }
}