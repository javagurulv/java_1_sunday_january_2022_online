package student_deniss_dubko.work_in_class;

import java.util.Random;

class ForExample {

    // Цикл (повторяющиеся операции)
    // Счётчик - переменная в цикле

    public static void main(String[] args) {

        for (int number = 1; number < 100; number++) { // (number++) = (number = number + 1)
            // (начальное значение; выполняется пока <100; как изменяется операция)
            System.out.println("Number = " + number);
        }

        Random random = new Random();

        int[] randomNumbers = new int[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(10000);
            randomNumbers[i] = randomNumber;
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }

    }

}
