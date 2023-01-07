package level01;

import java.util.Arrays;

class Phone {
    public String solution(String phone_number) {
        String answer = "";
        String[] array  = phone_number.split("");
        for(int i = 0; i < array.length; i++) {
            if(array.length - i <= 4) {
                answer += array[i] + "";
            } else {
                array[i] = "*";
                answer += array[i]+"";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String phone_number = "01033334444";
        Phone p = new Phone();
        System.out.println(p.solution(phone_number));
    }
}
