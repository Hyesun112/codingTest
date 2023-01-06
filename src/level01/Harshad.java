package level01;

class Harshad {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a = x;

        while(a >= 1){
            sum += a%10;
            a/=10;
        }

        if(x%sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Harshad h =  new Harshad();
        int x = 12;
        System.out.println(h.solution(x));
    }
}
