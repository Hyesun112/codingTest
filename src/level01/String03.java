package level01;

class String03 {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] arr = s.split("");
        for(String str : arr ) {
            cnt = str.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }

        return answer;
    }

    public static void main(String[] args) {
        String str = "try hello world";
        String03 s = new String03();
        // "TrY HeLlO WoRlD"
        System.out.println(s.solution(str));
    }
}
