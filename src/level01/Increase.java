package level01;

import java.util.Arrays;

class Increase {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for( long i = 0; i < n; i++) {
            answer[(int) i] = x + (x * i);
        }

//        answer[0] = x;
//
//        for(int i = 1; i < n; i++) {
//            answer[i] = answer[i-1] + x;
//        }

        return answer;
    }

    public static void main(String[] args) {
        Increase i = new Increase();
        int x = -4;
        int n = 2;
        System.out.println(Arrays.toString(i.solution(x, n)));
    }
}