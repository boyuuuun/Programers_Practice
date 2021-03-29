class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i=0; i<prices.length; i++) {
            int j = i; 
            int count = 0;
            
            // 다음인덱스 체크 == +1초
            while(++j<prices.length) {
                ++count;
                if(prices[i] > prices[j]) break;
            }
            answer[i] = count;
        }
        return answer;
    }
}
//24분
