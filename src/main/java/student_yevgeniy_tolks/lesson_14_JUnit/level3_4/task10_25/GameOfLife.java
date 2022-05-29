package student_yevgeniy_tolks.lesson_14_JUnit.level3_4.task10_25;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class GameOfLife {
    private GameOfLifeConsoleUi goLConsoleUi = new GameOfLifeConsoleUi();
    private GameOfLifeRandomBoardGenerator boardGenerator = new GameOfLifeRandomBoardGenerator();
    private GameOfLifeNextGenerationCalculator nextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter board width");
        int boardWidth = scanner.nextInt();
        System.out.println("Enter board height");
        int boardHeight = scanner.nextInt();

        boolean[][] field = boardGenerator.generate(boardWidth, boardHeight);
        int countInterations = 0;
        while (true) {
            if (countInterations < 300) {
                goLConsoleUi.show(field);
                sleepForSeconds(2);
                field = nextGenerationCalculator.calculate(field);
                ++countInterations;
                System.out.println(countInterations);
            } else {
                break;
            }
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }
}