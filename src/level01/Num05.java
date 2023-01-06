package level01;

class Num05 {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Num05 n = new Num05();
        String s = "-1234";
        System.out.println(n.solution(s));
    }
}
