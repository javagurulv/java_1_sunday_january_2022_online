package student_sergei_klunkov.lesson_5.level_2;


import java.util.Arrays;

class ArrayAverage{

    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 43;

        double averageNumber = Arrays.stream(numbers).sum()/3;
        System.out.println("Average number = " + averageNumber);

    }
}
