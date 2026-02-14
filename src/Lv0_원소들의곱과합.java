public class Lv0_원소들의곱과합 {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;

        // 방법 1
        int size = num_list.length;
        for (int i = 0; i < size; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }

        // 방법 2 : 확장된 for문
        for (int num : num_list) {
            sum += num;
            mul *= num;
        }

        return (mul < sum * sum) ? 1 : 0;
    }
}
