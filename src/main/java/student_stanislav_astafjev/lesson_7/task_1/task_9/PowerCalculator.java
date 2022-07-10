package student_stanislav_astafjev.lesson_7.task_1.task_9;

import student_stanislav_astafjev.lesson_5.Task_31.ArrayUtil;

class PowerCalculator {
    public static void main(String[] args) {
        int base = 3, exponent = 4 ;
        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = " + result);

    }

}
class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.firstTest();
    }
    public void firstTest() {
            int targetMaxNumber = 81;
            int[] array = {41, 51, 23, targetMaxNumber};

            int result = ArrayUtil.findMaxNumber(array);
            if (result == targetMaxNumber) {
                System.out.println("Both numbers check out");
            } else {
                System.out.println("Max number is wrong");
            }
            System.out.println(targetMaxNumber + " vs " + result);
        }
}
