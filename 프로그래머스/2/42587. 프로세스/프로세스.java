import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int point = priorities.length-1;
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0; i<priorities.length; i++) {
        	q.offer(priorities[i]);
        }
        Arrays.sort(priorities);
        
        while(true) {
        	if(q.peek()==priorities[point]) {
        		q.poll();
        		answer++;
        		point--;
        		
    			if(location == 0) {
    				System.out.println(answer);
    				return answer;
    			}
        	}else {
        		q.offer(q.poll());
        	}
        	
        	if(location == 0) {
        		location += q.size();
        	}
        	location--;
        	
        }
    }
}