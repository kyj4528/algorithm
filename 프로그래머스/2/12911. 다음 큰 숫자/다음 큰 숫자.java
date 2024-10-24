class Solution {
    
    public int solution(int n) {
        int nCnt = Integer.bitCount(n);
		
		// 갯수가 같아지기 전까지 반복문 진행
		while(nCnt != Integer.bitCount(++n)) {}
		
		return n;
    }
}