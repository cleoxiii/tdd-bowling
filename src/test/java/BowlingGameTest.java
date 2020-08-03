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


    @Test
    void should_calculate_total_score_when_exist_spare_normally_in_first_nine_frames() {
        int[] scores = {1, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        BowlingGame game = new BowlingGame();

        int totalScore = game.calculateTotalScore(scores);

        assertEquals(14, totalScore);
    }

    @Test
    void should_calculate_total_score_when_exist_spare_normally_in_first_nine_frames_continued() {
        int[] scores = {1, 9, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        BowlingGame game = new BowlingGame();

        int totalScore = game.calculateTotalScore(scores);

        assertEquals(86, totalScore);
    }

    @Test
    void should_calculate_total_score_when_exist_spare_in_last_frame() {
        int[] scores = {1, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 8, 2};
        BowlingGame game = new BowlingGame();

        int totalScore = game.calculateTotalScore(scores);

        assertEquals(18, totalScore);
    }

    @Test
    void should_calculate_total_score_when_exist_strike_normally_in_first_nine_frames() {
        int[] scores = {10, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        BowlingGame game = new BowlingGame();

        int totalScore = game.calculateTotalScore(scores);

        assertEquals(16, totalScore);
    }

    @Test
    void should_calculate_total_score_when_exist_strike_in_last_frame() {
        int[] scores = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 10, 1, 2};
        BowlingGame game = new BowlingGame();

        int totalScore = game.calculateTotalScore(scores);

        assertEquals(40, totalScore);
    }
}
