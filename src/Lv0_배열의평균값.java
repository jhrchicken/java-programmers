public class Lv0_배열의평균값 {
    public double solution(int[] numbers) {
        double answer = 0;

        for (int number : numbers) {
            answer += number;
        }

        return answer / numbers.length;
    }
}
