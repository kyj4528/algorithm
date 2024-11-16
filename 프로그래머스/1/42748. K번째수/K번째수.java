import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i,j,k;
        for(int x=0; x<commands.length; x++) {
    		i = commands[x][0]-1;
    		j = commands[x][1];
    		k = commands[x][2]-1;
    		int cnt = 0;
    		int[] arrSet = new int[j-i];
    		for(int y=i; y<j; y++) {
    			arrSet[cnt] = array[y];
    			cnt++;
    		}
    		Arrays.sort(arrSet);
    		answer[x] = arrSet[k];
        }
        return answer;
    }
}