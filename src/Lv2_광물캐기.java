import java.util.ArrayList;
import java.util.List;

public class Lv2_광물캐기 {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int total = picks[0] + picks[1] + picks[2];
        int limit = Math.min(minerals.length, total * 5);
        int group = (limit + 4) / 5;

        List<int[]> mineralList = new ArrayList<>();
        for (int i = 0; i < group; i++) {

            int diamond = 0;
            int iron = 0;
            int stone = 0;

            for (int j = i * 5; j < Math.min(i * 5 + 5, limit); j++) {
                if (minerals[j].equals("diamond")) diamond++;
                if (minerals[j].equals("iron")) iron++;
                if (minerals[j].equals("stone")) stone++;
            }

            int score = diamond * 25 + iron * 5 + stone;
            mineralList.add(new int[]{score, diamond, iron, stone});
        }

        mineralList.sort((a, b) -> b[0] - a[0]);

        for (int[] mineral : mineralList) {

            int diamond = mineral[1];
            int iron = mineral[2];
            int stone = mineral[3];

            if (picks[0] > 0) {
                answer += (diamond + iron + stone);
                picks[0]--;
            }
            else if (picks[1] > 0) {
                answer += (diamond * 5 + iron + stone);
                picks[1]--;
            }
            else if (picks[2] > 0) {
                answer += (diamond * 25 + iron * 5 + stone);
                picks[2]--;
            }
        }

        return answer;
    }
}
