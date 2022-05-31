package student_stanislav_astafjev.lesson_5.Task_14;

public class ArrayOfIntegers {

    public static void main(String[] args) {

        int[] numbers = new int[] {20, -30, 76};
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        double average;
        average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);


    }
}
