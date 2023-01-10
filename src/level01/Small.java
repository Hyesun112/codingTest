package level01;

import java.util.Arrays;

class Small {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1) {
            answer = new int[] {-1};
            return answer;
        }

        answer = new int[arr.length-1];

        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[index++] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Small s = new Small();
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}
