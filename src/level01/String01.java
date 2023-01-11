package level01;

import java.util.Arrays;
import java.util.Collections;

class String01 {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        Arrays.sort(array, Collections.reverseOrder());
        answer = String.join("", array);

        return answer;
    }

    public static void main(String[] args) {
        String str = "Zbcdefg";
        String01 s = new String01();
        System.out.println(s.solution(str));
    }
}
