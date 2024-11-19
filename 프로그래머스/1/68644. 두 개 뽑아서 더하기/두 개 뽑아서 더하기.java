import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hs = new HashSet<>();
		Arrays.sort(numbers);
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				hs.add(numbers[i]+numbers[j]);
			}
		}
        int[] answer = new int[hs.size()];
        Iterator<Integer> iter = hs.iterator();
        for(int i=0; i<answer.length; i++) {
        	answer[i] = iter.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}