package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_4_junior;

import java.util.Random;

class Task30OddMarksOfRandomArray {

    public static void main(String[] args) {

        int[] randomMarks = new int[4];

        for (int i = 0; i < randomMarks.length; i++) {
            Random random = new Random();
            int randomMark = random.nextInt();
            randomMarks[i] = randomMark;
            System.out.println(randomMarks[i]);
        }

        int oddMarksOfArray = randomMarks[0];
        for (int i = 0; i < randomMarks.length; i++) {
            if (randomMarks[i] % 2 != 0) {
                oddMarksOfArray = randomMarks[i];
                System.out.println();
                System.out.println("Odd marks of array: " + oddMarksOfArray);
            }
        }
    }

}
