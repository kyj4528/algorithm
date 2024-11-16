import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 각 기능별 업무시간 도출
		int[] process = new int[progresses.length];
		for(int i=0; i<process.length; i++) {
			
			process[i] = (100-progresses[i])/speeds[i];
			
			if((100-progresses[i])%speeds[i] !=0) {
				process[i]+= 1;
			}
		}

		// 큐에 내용 저장
		Queue<Integer> q = new LinkedList<Integer>();
		int cnt = 1;
		int max = process[0];
		
		for(int i=1; i<process.length; i++) {
			if(process[i] > max) {
				max = process[i];
				q.offer(cnt);
				cnt = 1;
			}else {
				cnt++;
			}
		}
		q.offer(cnt);
		// 결과 가져오기
        int[] answer = new int[q.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = q.poll();
			System.out.println(answer[i]);
        }
        return answer;
    }
}