package student_vitaly_galuzo.lesson_5.level_5;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();

        arrayUtilTest.arrayLengthTest();



    }

    public void arrayLengthTest() {

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(5);
        if (array.length > 0) {
            System.out.println("TEST = PASSED!");
        } else {
            System.out.println("TEST = FAILED!");
        }
        }
















}
