import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[1000000];
        answer[0] = arr[0];
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(answer[cnt] != arr[i]){
                cnt++;
                answer[cnt] = arr[i];
            }
        }
        answer = Arrays.copyOf(answer,cnt+1);

        return answer;
    }
}