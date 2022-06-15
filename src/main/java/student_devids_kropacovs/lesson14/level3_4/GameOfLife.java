package student_devids_kropacovs.lesson14.level3_4;

import java.util.concurrent.TimeUnit;

class GameOfLife {
    private GameOfLifeUI ui = new GameOfLifeUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        boolean[][] field = generator.generateRandomField(5, 5);
        while(true) {
            ui.show(field);
            sleepForSeconds(5);
            field = calculator.calculate(field);
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
