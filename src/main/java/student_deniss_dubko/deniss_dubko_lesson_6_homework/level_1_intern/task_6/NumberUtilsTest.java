package student_deniss_dubko.deniss_dubko_lesson_6_homework.level_1_intern.task_6;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.shouldShowOnConsoleIsEven();
    }

    public void shouldShowOnConsoleIsEven() {
        NumberUtils numberUtils = new NumberUtils();
        boolean isNumberEven = numberUtils.isEven(8);
        if (isNumberEven) {
            System.out.println("Test Is number Even is: OK");
        } else {
            System.out.println("Test Is number Even is: FAIL");
        }
    }

}
