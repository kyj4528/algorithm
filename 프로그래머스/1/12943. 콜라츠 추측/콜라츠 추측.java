class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long number = num;
        while(cnt <= 500){
            if(number == 1){
                break;
            }
            if(number%2==0){
                number /= 2;
            }else{
                number = number*3+1;
            }
            cnt++;
            answer++;
        }
        return number == 1 ? answer : -1;
    }
}