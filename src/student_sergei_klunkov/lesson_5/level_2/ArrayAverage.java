package student_sergei_klunkov.lesson_5.level_2;


import java.util.Arrays;
import java.util.Random;

class ArrayAverage{

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[3];
        numbers[0] = (int)(Math.random()*10);
        numbers[1] = (int)(Math.random()*10);
        numbers[2] = (int)(Math.random()*10);
        System.out.println(Arrays.toString(numbers));

        int averageNumber = numbers[0] + numbers[1] +numbers[2]/ numbers.length;
        System.out.println("Average number: " + averageNumber);
    }
}

