package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_4_junior;

import java.util.Random;

class Task27MaximumMarkOfRandomArray {

    public static void main(String[] args) {

        int[] randomMarks = new int[5];

        for (int i = 0; i < randomMarks.length; i++) {
            Random random = new Random();
            int randomMark = random.nextInt();
            randomMarks[i] = randomMark;
            System.out.println(randomMarks[i]);
        }

        int maxMarkOfArray = randomMarks[0];
        for (int i = 0; i < randomMarks.length; i++) {
            if (randomMarks[i] > maxMarkOfArray) {
                maxMarkOfArray = randomMarks[i];
                System.out.println();
                System.out.println("Max mark of array: " + maxMarkOfArray);
            }
        }
    }

}