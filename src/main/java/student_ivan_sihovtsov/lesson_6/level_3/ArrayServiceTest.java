package student_ivan_sihovtsov.lesson_6.level_3;

public class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.numberToSearchPositive();
        arrayServiceTest.numberToSearchNegative();
    }

    public void numberToSearchPositive() {
        ArrayService arrayService = new ArrayService();
        boolean arr = arrayService.contains(new int[]{5, 8, 32, 336}, 32);
        if (arr) {
            System.out.println("Positive test is OK");
        } else {
            System.out.println("Positive test is Fail");
        }
    }

    public void numberToSearchNegative() {
        ArrayService arrayService = new ArrayService();
        boolean arr = arrayService.contains(new int[]{5, 8, 32, 336}, 31);
        if (arr) {
            System.out.println("Negative test is Fail");
        } else {
            System.out.println("Negative test is OK");
        }
    }
}
