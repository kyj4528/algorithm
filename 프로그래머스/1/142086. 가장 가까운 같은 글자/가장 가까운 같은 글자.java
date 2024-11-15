class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        boolean[] visited = new boolean[26];
        int num = s.charAt(0)-97;
        int cnt=1;
        answer[0] = -1;
        visited[num] = true;
        for(int i=1; i<answer.length; i++) {
        	num = s.charAt(i)-97;
        	if(visited[num]) {
        		for(int j=i-1; j>=0; j--) {
        			if(s.charAt(i)==s.charAt(j)) {
        				answer[i] = cnt;
        				cnt = 1;
        				break;
        			}
        			cnt++;
        		}
        	}else {
        		visited[num] = true;
        		answer[i] = -1;
        	}
        }

        return answer;
    }
}