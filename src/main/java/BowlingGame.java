public class BowlingGame {
    private static final int FULL_SCORE = 10;

    public int calculateTotalScore(int[] scores) {
        int totalScore = 0;
        int index = 0;
        for (int frame = 0; frame < 10; ++frame) {
            int scoreOfSingleFrame = scores[index] + scores[index + 1];
            if ( scoreOfSingleFrame == 10) {
                totalScore += FULL_SCORE + scores[index + 2];
            } else {
                totalScore += scoreOfSingleFrame;
            }
            index += 2;
        }

        return totalScore;
    }
}
