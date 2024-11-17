class Solution {
    static int[] visited;
  
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new int[computers.length];
		for(int i=0; i<computers.length;i++) {
			if(visited[i]==0) {
				answer++;
				dfs(computers,i);
			}
		}
        return answer;
    }
    
    public void dfs(int[][] computers, int curCom) {
		visited[curCom] = 1;
		for(int i=0; i<computers[curCom].length; i++) {
			if(computers[curCom][i]==1 && visited[i]==0) {
				dfs(computers,i);
			}
		}
	}
}