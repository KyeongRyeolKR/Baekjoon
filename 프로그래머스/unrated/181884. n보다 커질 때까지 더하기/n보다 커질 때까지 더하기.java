import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int n) {
        return Arrays.stream(numbers)
                .reduce(0, (sum, e) -> sum <= n ? sum + e : sum);
    }
}