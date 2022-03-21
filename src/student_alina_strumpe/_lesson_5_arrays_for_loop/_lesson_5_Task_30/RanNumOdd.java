package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_30;

import java.util.Random;

public class RanNumOdd {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numbersArray = new int[10];

        for (int i = 0; i < numbersArray.length; i++) {
            int number = random.nextInt(11);
            numbersArray[i] = number;
            System.out.println("[" + i + "]" + numbersArray[i]);
        }
        boolean isEven = true;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 != 0) {
                System.out.println("odd = " + numbersArray[i]);
            }

        }
    }

}





