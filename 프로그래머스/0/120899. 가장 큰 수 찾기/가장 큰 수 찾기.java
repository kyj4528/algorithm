class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = array[0];
        int index = 0;
		for(int i=1; i<array.length; i++) {
			if(array[i] >= array[i-1]) {
				maxNum = array[i];
				index = i;
			}
		}
		answer[0] = maxNum;
		answer[1] = index;
        return answer;
    }
}