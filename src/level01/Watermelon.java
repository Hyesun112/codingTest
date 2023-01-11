package level01;

class Watermelon {
    public String solution(int n) {
        String answer = "";
        for(int i = 1; i <= n; i++) {
//            if(i%2 != 0) {
//                answer += "수"+"";
//            } else {
//                answer += "박";
//            }
            answer += i%2 != 0? "수"+"" : "박";
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        Watermelon w = new Watermelon();
        System.out.println(w.solution(n));
    }
}
