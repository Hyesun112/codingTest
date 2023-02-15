package level01;

class Caesar {
    public String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); //  String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환

            if(Character.isUpperCase(ch)) { // 소문자
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            } else if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            }
            answer += ch;
        }
        return answer;
    }
}
