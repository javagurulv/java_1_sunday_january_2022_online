package student_yevgeniy_tolks.lesson_6.level_1;

class Task_6_NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;         //simplified if statement
    }
}

class Task_6_NumberUtilsTest {

    public static void main(String[] args) {
        Task_6_NumberUtilsTest numberUtilsTest = new Task_6_NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    public void isEvenTest() {
        Task_6_NumberUtils numberUtils = new Task_6_NumberUtils();
        boolean isEvenNumber = numberUtils.isEven(122);
        if (isEvenNumber) {
            System.out.println("Number is even - Test OK");
        } else {
            System.out.println("Number is not even - Test FAILED");

        }

    }


}