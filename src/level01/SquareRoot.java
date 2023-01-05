package level01;

class SquareRoot {
    public long solution(long n) {
        long answer = 0;
        for( long i = 1; i*i <= n; i++) {
            if( i * i == n) {
                answer = (i+1) * (i+1);
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SquareRoot s = new SquareRoot();
        long n = 121;
        System.out.println(s.solution(n));
    }
}


