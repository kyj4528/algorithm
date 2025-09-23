class Solution {
    public int solution(String s) {
        // 부호체크를 위한 boolean체크 
		// + = true, - = false
		boolean sign = true;
		//최종 return값 저장을 위한 변수
        int answer = 0;
        
        //문자열 길이만큼 반복
        for(int i=0; i<s.length(); i++) {
        	// 부호가 -면 값 false로 바꿈
        	if('-' == s.charAt(i)){
        		sign = false;
        	}else if('+' != s.charAt(i)) {
        		answer = answer * 10 + (s.charAt(i) - '0');
        	}
        }
        return sign ? answer : -1 * answer;
    }
}