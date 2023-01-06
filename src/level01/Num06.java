package level01;

class Num06 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++ ) {
            if(n%i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Num06 n = new Num06();
        System.out.println(n.solution(1008));
    }
}
