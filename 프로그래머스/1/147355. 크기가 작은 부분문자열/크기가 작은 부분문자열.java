class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long intP = Long.parseLong(p);
        long subStr = 0;
        for(int i=0; i<t.length()-p.length()+1; i++) {
        	subStr = Long.parseLong(t.substring(i, i+p.length()));
        	if(subStr <= intP) {
        		answer++;
        	}
        }
        return answer;
    }
}