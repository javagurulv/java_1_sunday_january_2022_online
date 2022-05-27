package student_yevgeniy_tolks.lesson_14_JUnit.level3_4.task10_25;

import java.util.Random;

public class GameOfLifeRandomBoardGenerator {

    public boolean[][] generate(int boardWidth, int boardHeight) {
        Random random = new Random();
        boolean[][] randomBoardGenerator = new boolean[boardWidth][boardHeight];
        for (int i = 0; i < randomBoardGenerator.length; i++) {
            for (int j = 0; j < randomBoardGenerator[0].length; j++) {
                randomBoardGenerator[i][j] = random.nextBoolean();
            }
        }

        return randomBoardGenerator;
    }
}
