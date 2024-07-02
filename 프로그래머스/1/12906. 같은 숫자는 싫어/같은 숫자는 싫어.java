import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[1000000];
        answer[0] = arr[0];
        int cnt = 1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                answer[cnt] = arr[i+1];
                cnt++;
            }
        }
        answer = Arrays.copyOf(answer,cnt);

        return answer;
    }
}