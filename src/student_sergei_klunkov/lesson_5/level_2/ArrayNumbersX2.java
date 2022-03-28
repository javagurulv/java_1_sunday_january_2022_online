package student_sergei_klunkov.lesson_5.level_2;

import java.util.Arrays;

public class ArrayNumbersX2 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 15;
        numbers[2] = 31;

        System.out.println(Arrays.toString(numbers));

        numbers[0] = numbers[0] * 2;
        numbers[1] = numbers[1] * 2 ;
        numbers[2] = numbers[2] * 2 ;

        System.out.println(Arrays.toString(numbers));

    }


}
