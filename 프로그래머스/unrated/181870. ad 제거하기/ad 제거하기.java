import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                .filter(e -> !e.contains("ad"))
                .toArray(String[]::new);
    }
}