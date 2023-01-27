package level01;

import java.util.ArrayList;

class Trit {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 0) {
            list.add(n%3);
            n /= 3;
        }
        int tmp = 1;
        for(int i = list.size()-1; i >= 0; i--) {
            answer += list.get(i) * tmp;
            tmp *= 3;
        }

        return answer;
    }

    public static void main(String[] args) {
        Trit t = new Trit();
        int n = 45;
        System.out.println(t.solution(n));
    }
}
