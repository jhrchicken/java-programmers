public class Lv0_세개의구분자 {
    public String[] solution(String myStr) {
        String[] answer = {};

        myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ");

        if (myStr.trim().isEmpty()) {
            answer = new String[]{"EMPTY"};
        }
        else {
            answer = myStr.trim().split("\\s+");
        }

        return answer;
    }
}
