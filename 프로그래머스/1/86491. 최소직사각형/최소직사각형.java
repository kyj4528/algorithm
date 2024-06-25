import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];
        for(int i=0;i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                w[i] = sizes[i][0];
                h[i] = sizes[i][1];
            }else{
                w[i] = sizes[i][1];
                h[i] = sizes[i][0];
            }
        }
        Arrays.sort(w);
        Arrays.sort(h);
        
        return w[w.length-1] * h[h.length-1];
    }
}