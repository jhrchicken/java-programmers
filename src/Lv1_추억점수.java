import java.util.HashMap;
import java.util.Map;

public class Lv1_추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                sum += map.get(photo[i][j]) == null ? 0 : map.get(photo[i][j]);
            }
            answer[i] = sum;
        }

        return answer;
    }
}
