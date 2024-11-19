class Solution {
    public int solution(String my_string) {
        char[] numSet = {'1','2','3','4','5','6','7','8','9'};
        int answer = 0;
		int cnt;
		for(int i=0; i<numSet.length; i++) {
			cnt = 0;
			for(int j=0; j<my_string.length(); j++) {
				if(my_string.charAt(j) == numSet[i]) {
					cnt++;
				}
			}
			answer += cnt * (numSet[i] -'0');
		}
        return answer;
    }
}