package level01;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 2;
        String answer = "";

        if(num%2==0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        System.out.println(answer);

    }
}
