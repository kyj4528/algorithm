import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        if(cnt == 0 ){
            answer[0] = -1;
            cnt++;
        }
        answer = Arrays.copyOf(answer, cnt);
        
        Arrays.sort(answer);
        return answer;
    }
}