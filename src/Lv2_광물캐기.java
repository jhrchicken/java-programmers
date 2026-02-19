public class Lv2_광물캐기 {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;

        // 5개씩 묶어서 점수 매기기 // 25 // 5 // 1
        int row = (minerals.length + 4) / 5;
        String aaa[][] = new String[row][];
        for (int i = 0; i < minerals.length; i++) {
            aaa[i / 5][i % 5] = minerals[i];
        }


        return answer;
    }
}
