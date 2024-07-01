class Solution {
    //price : 이용료, money : 보유금액, count : 탑승횟수
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i=1; i<=count; i++){
            sum += (price * i);
        }
        if( sum > money){
            answer = sum - money;
        }else{
            answer = 0;
        }
        return answer;
    }
}