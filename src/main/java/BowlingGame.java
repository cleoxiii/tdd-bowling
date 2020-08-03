public class BowlingGame {
    private static final int FULL_SCORE = 10;

    public int calculateTotalScore(int[] scores) {
        int totalScore = 0;
        int index = 0;
        int lastFrame = 9;
        for (int frame = 0; frame < 10; ++frame) {
            int scoreOfSingleFrame = scores[index] + scores[index + 1];
            if (frame == lastFrame && isStrike(index, scores)) {
                totalScore += FULL_SCORE + scores[index + 1] + scores[index + 2];
            } else if (isStrike(index, scores)) {
                totalScore += FULL_SCORE + scores[index + 2] + scores[index + 3];
            } else if (isSpare(index, scores)){
                totalScore += scoreOfSingleFrame + scores[index + 2];
            } else {
                totalScore += scoreOfSingleFrame;
            }
            index += 2;
        }

        return totalScore;
    }

    private boolean isSpare(int index, int[] scores) {
        return scores[index] + scores[index + 1] == 10;
    }

    private boolean isStrike(int index, int[] scores) {
        return scores[index] == 10;
    }
}
