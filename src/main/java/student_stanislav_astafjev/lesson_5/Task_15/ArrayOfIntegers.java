package student_stanislav_astafjev.lesson_5.Task_15;


import java.util.Arrays;

public class ArrayOfIntegers {
    public static void main(String[] args) {

        int [] numbers = new int[3];
        numbers[0] = 18;
        numbers[1] = 49;
        numbers[2] = 3;

        System.out.println(Arrays.toString(numbers));

        for (int i = 0 ; i < numbers.length; i++) {
            numbers[i] += 2;
        }
        System.out.println(Arrays.toString(numbers));


    }
}
