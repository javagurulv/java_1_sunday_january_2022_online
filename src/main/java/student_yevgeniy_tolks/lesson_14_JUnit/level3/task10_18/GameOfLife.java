package student_yevgeniy_tolks.lesson_14_JUnit.level3.task10_18;

import java.util.concurrent.TimeUnit;

class GameOfLife {
    GoLConsoleUi goLConsoleUi = new GoLConsoleUi();
    GoLRandomBoardGenerator boardGenerator = new GoLRandomBoardGenerator();
    GoLNextGenerationCalculator nextGenerationCalculator = new GoLNextGenerationCalculator();


    public void run() {

        boolean[][] field = boardGenerator.generate(10, 10);
        while (true) {
            goLConsoleUi.show(field);
            sleepForSeconds(5);
            field = nextGenerationCalculator.calculate(field);
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
