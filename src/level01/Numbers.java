package level01;

import java.util.Arrays;

class Numbers {
    public int solution(int[] numbers) {
        int answer = 45;

        for(int number : numbers) {
            answer -= number;
        }


        return answer;
    }

    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,6,7,8,0};
        int[] numbers = {5,8,4,0,6,7,9};
        Numbers n = new Numbers();
        System.out.println(n.solution(numbers));
    }
}
