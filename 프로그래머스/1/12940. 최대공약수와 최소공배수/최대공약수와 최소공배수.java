class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int bigNum,smlNum,num;
        //큰수 판별
        if(n>m) {
			bigNum = n;
			smlNum = m;
		}else {
			bigNum = m;
			smlNum = n;
		}
        
        while(bigNum%smlNum != 0) {
        	num = smlNum;
        	smlNum = bigNum%smlNum;
        	bigNum = num;
        }
        answer[0] = smlNum;
        answer[1] = m*n/smlNum;
        return answer;
    }
}