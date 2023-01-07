package level01;

import java.util.Arrays;

class Divisor {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0) {
                count++;
            }
        }

        answer = new int[count];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        System.out.println(arr.length);
        int divisor = 5;
        Divisor d = new Divisor();
        System.out.println(Arrays.toString(d.solution(arr, divisor)));
    }
}
