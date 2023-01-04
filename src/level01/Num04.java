package level01;

public class Num04 {
    public int Num04(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        System.out.println(num);
        String[] array = num.split("");
        for(int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
            answer += Integer.parseInt(array[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 1212;
        Num04 num = new Num04();
        System.out.println(num.Num04(n));
    }
}
