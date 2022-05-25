package student_yevgeniy_tolks.lesson_6.level_1;

class Task6NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;         //simplified if statement
    }
}

class Task6NumberUtilsTest {

    public static void main(String[] args) {
        Task6NumberUtilsTest numberUtilsTest = new Task6NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    public void isEvenTest() {
        Task6NumberUtils numberUtils = new Task6NumberUtils();
        boolean isEvenNumber = numberUtils.isEven(122);
        if (isEvenNumber) {
            System.out.println("Number is even - Test OK");
        } else {
            System.out.println("Number is not even - Test FAILED");

        }

    }


}