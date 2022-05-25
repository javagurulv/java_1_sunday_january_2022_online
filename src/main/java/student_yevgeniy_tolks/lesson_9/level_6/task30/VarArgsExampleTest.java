package student_yevgeniy_tolks.lesson_9.level_6.task30;

class VarArgsExampleTest {
    public static void main(String[] args) {
        VarArgsExampleTest varArgsExampleTest = new VarArgsExampleTest();
        varArgsExampleTest.sumOfNumbersTest();
    }

    public void sumOfNumbersTest() {
        int num1 = 2;
        int num2 = 2;
        int num3 = 2;
        int num4 = 2;
        int num5 = 2;

        int expectedSum = 10;

        VarArgsExample varArgsExample = new VarArgsExample();
        int resultSum = varArgsExample.sumNumbers(num1, num2, num3, num4, num5);
        if (expectedSum == resultSum) {
            System.out.println("Variable argument list works - TEST OK");
        } else {
            System.out.println("Variable argument list works - TEST FAILED");
        }
    }
}
