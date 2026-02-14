public class Lv2_거리두기확인하기 {
    public int[] solution(String[][] places) {

        // 초기화
        int[] answer = new int[5];
        for (int i = 0; i < 5; i++) {
            answer[i] = 1;
        }

        for (int room = 0; room < 5; room++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (places[room][i].charAt(j) == 'P') {
                        if ((j + 1 < 5) && (places[room][i].charAt(j + 1) == 'P')) {
                            answer[room] = 0;
                        }
                        if ((j + 2 < 5) && (places[room][i].charAt(j + 2) == 'P')) {
                            if (places[room][i].charAt(j + 1) != 'X') {
                                answer[room] = 0;
                            }
                        }
                        if ((i + 1 < 5) && (places[room][i + 1].charAt(j) == 'P')) {
                            answer[room] = 0;
                        }
                        if ((i + 2 < 5) && (places[room][i + 2].charAt(j) == 'P')) {
                            if (places[room][i + 1].charAt(j) != 'X') {
                                answer[room] = 0;
                            }
                        }
                        if ((i + 1 < 5) && (j + 1 < 5) && (places[room][i + 1].charAt(j + 1) == 'P')) {
                            if (places[room][i + 1].charAt(j) != 'X' || places[room][i].charAt(j + 1) != 'X') {
                                answer[room] = 0;
                            }
                        }
                        if ((i + 1 < 5) && (j - 1 >= 0) && (places[room][i + 1].charAt(j - 1) == 'P')) {
                            if (places[room][i + 1].charAt(j) != 'X' || places[room][i].charAt(j - 1) != 'X') {
                                answer[room] = 0;
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }
}
