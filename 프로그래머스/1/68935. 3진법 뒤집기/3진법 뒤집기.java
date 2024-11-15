class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN = Integer.toString(n, 3);
        String reverseStr = "";
        for(int i=strN.length()-1; i>=0; i--) {
        	reverseStr += strN.charAt(i);
        }
        answer = Integer.parseInt(reverseStr,3);
        return answer;
    }
}