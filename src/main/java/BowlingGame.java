import java.util.Arrays;

public class BowlingGame {
    public int calculateTotalScore(int[] scores) {
        int totalScore = Arrays.stream(scores).reduce(Integer::sum).getAsInt();
        return totalScore;
    }
}
