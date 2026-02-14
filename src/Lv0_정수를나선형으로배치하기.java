public class Lv0_정수를나선형으로배치하기 {
    public int[][] solution(int n) {
        int[][] answer = {};

        if (n == 1) {
            return new int[][]{{1}};
        }

        answer = new int[n][n];
        int x = 0;
        int y = 0;
        String direction = "right";

        for (int i = 0; i < n * n; i++) {
            answer[x][y] = i + 1;
            if (direction == "right") {
                y++;
                if ((y == n - 1) || (answer[x][y + 1] != 0)) {
                    direction = "down";
                }
            }
            else if (direction == "down") {
                x++;
                if ((x == n - 1) || (answer[x + 1][y] != 0)) {
                    direction = "left";
                }
            }
            else if (direction == "left") {
                y--;
                if ((y == 0) || (answer[x][y - 1] != 0)) {
                    direction = "up";
                }
            }
            else if (direction == "up") {
                x--;
                if ((x == 0) || (answer[x - 1][y] != 0)) {
                    direction = "right";
                }
            }
        }

        return answer;
    }
}
