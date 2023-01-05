package level01;

class CountPY {
    boolean solution(String s) {
        boolean answer = true;
        String str = s.toLowerCase();
        int yCount = str.length() - str.replace("p", "").length();
        int pCount = str.length() - str.replace("y", "").length();

        if( !str.contains("p") && !str.contains("y")) {
            answer = true;
        } else if (yCount == pCount) {
            answer = true;
        } else if (yCount != pCount) {
            answer = false;
        }
        return answer;
    }
    // 좋은 예
//    boolean solution(String s) {
//        s = s.toUpperCase();
//
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
//    }

    public static void main(String[] args) {
        CountPY c = new CountPY();
        String s = "Sddd";
        System.out.println(c.solution(s));
    }
}
