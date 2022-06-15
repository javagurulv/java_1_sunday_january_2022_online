package student_devids_kropacovs.lesson14.level3_4;

import java.util.Scanner;
import  java.util.Random;
class GameOfLifeRandomFieldGenerator {


    public boolean[][] generateRandomField(int width, int height) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //System.out.print("Enter width of field. x: ");
        //int width = scanner.nextInt();
        //System.out.print("Enter height of field. y: ");
        //int height = scanner.nextInt();
        boolean[][] field = new boolean[width][height];
        for (int row = 0; row < width; row++) {
            for (int col = 0; col < height; col++) {
                field[row][col] = random.nextBoolean();
            }
        }
        return field;
    }
}
