package student_sergei_klunkov.lesson_14.level_3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class GameOfLife {
    private GameOfLifeConsoleUI goLConsoleUi = new GameOfLifeConsoleUI();
    private GameOfLifeRandomBoardGenerator boardGenerator = new GameOfLifeRandomBoardGenerator();
    private GameOfLifeNextGenerationCalculator nextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter board width");
        int boardWidth = scanner.nextInt();
        System.out.println("Enter board height");
        int boardHeight = scanner.nextInt();

        boolean[][] field = boardGenerator.generate(boardWidth, boardHeight);
        int countInteractions = 0;
        while (true) {
            if (countInteractions < 300) {
                goLConsoleUi.show(field);
                sleepForSeconds(2);
                field = nextGenerationCalculator.calculate(field);
                ++countInteractions;
                System.out.println(countInteractions);
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
