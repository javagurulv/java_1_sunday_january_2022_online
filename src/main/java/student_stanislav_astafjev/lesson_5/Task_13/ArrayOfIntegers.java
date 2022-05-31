package student_stanislav_astafjev.lesson_5.Task_13;


import java.util.Arrays;

public class ArrayOfIntegers {
    public static void main(String[] args) {

        int [] numbers = new int[3];
        numbers[0] = (int) (Math.random() * 100);
        numbers[1] = (int) (Math.random() * 100);
        numbers[2] = (int) (Math.random() * 100);

        int sumNum = numbers[2];

        System.out.println((Arrays.toString(numbers)) + " = Sum of random numbers " + sumNum);

    }


    
}
