package level01;

class Seoul {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        Seoul s = new Seoul();
        System.out.println(s.solution(seoul));
    }
}
