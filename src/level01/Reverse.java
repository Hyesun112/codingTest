package level01;

import java.util.ArrayList;
import java.util.List;

class Reverse {
    public int[] Reverse(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt = 0;
        while (n>0) {
            answer[cnt] = (int) (n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
//        String num = new StringBuffer(String.valueOf(n)).reverse().toString();
//        String[] array = num.split("");
//        answer = new int[array.length];
//        for(int i = 0; i < array.length; i++){
//            answer[i] = Integer.parseInt(array[i]);
//        }
        return answer;
    }

    public static void main(String[] args) {
        Reverse r = new Reverse();
        long n = 12345;
        System.out.println(r.Reverse(n));
    }
}


