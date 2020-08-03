import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    void should_calculate_total_score_when_all_throws_are_pin() {
        int[] scores = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        BowlingGame game = new BowlingGame();

        int totalScore = game.calculateTotalScore(scores);

        assertEquals(0, totalScore);
    }

    @Test
    void should_calculate_total_score_when_all_throws_are_pin_continued() {
        int[] scores = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        BowlingGame game = new BowlingGame();

        int totalScore = game.calculateTotalScore(scores);

        assertEquals(30, totalScore);
    }
}
