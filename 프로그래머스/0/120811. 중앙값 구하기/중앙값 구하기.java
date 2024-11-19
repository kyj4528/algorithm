import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);

        answer = array[array.length/2];

        return answer;
    }
}