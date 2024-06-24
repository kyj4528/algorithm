import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int getNum = nums.length / 2;
        int cnt = 1;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(getNum == cnt){
                break;
            }
            if(nums[i] != nums[i+1]){
                cnt++;
            }
        }
        return cnt;
    }
}