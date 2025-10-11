class Solution {
    public int solution(String s) {
        String numArr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int answer = 0;
        
        for(int i=0; i<numArr.length; i++){
            s = s.replaceAll(numArr[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}