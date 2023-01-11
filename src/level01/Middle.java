package level01;

import java.util.Arrays;

class Middle {
    public String solution(String s) {
        String answer = "";
//        String[] array = s.split("");
//
//        if(array.length%2 == 0) {
//            answer = array[array.length/2-1]+""+array[array.length/2];
//        } else {
//            answer = array[array.length/2];
//        }

        return answer = s.length()%2 == 0? s.substring(s.length()/2 -1, s.length()/2 +1) : s.substring(s.length()/2);
    }

    public static void main(String[] args) {
        String s = "qwer";
        Middle m = new Middle();
        System.out.println(m.solution(s));
    }
}
