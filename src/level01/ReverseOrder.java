package level01;

import java.util.Arrays;
import java.util.Collections;

class ReverseOrder {
    public long solution(long n) {
        long answer = 0;
        String str = "";
        String [] arrays = String.valueOf(n).split("");
        Integer[] array = new Integer[String.valueOf(n).length()];
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.valueOf(arrays[i]);
        }
        Arrays.sort(array, Collections.reverseOrder());

        for(Integer i : array) {
            str = str + (i + "");
        }

        return answer = Long.parseLong(str);
    }

    public static void main(String[] args) {
        ReverseOrder r = new ReverseOrder();
        long n = 118372;
        System.out.println(r.solution(n));
    }
}
