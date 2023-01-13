package level01;

class Money {
    public long solution(int price, int money, int count) {
        long answer = -1;
        int tot = 0;
        for(int i = 1; i <= count; i++) {
            tot += i * price;
        }
        if( tot > money ) {
            answer = tot - money;
        } else {
            answer = 0;
        }
        return answer;
    }
}
