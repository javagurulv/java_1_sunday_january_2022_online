package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_2_intern;

import java.util.Random;

class Task15IncreaseOfThreeRandomArrayNumbers {

    public static void main(String[] args) {

        Random random = new Random();

        int[] randomMarks = new int[3];
        for (int i = 0; i < randomMarks.length; i++) {
            int randomMark = random.nextInt(10);
            randomMarks[i] = randomMark;
            System.out.println(randomMarks[i]);
        }

        System.out.println();

        int increaseOfArrayNumbers = 0;
        for (int i = 0; i < randomMarks.length; i++) {
            increaseOfArrayNumbers = randomMarks[i] + 2;
            System.out.println(increaseOfArrayNumbers);
        }
    }

}
