package student_devids_kropacovs.lesson5.level5and6;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.maxNumberTest();
        test.minNumberTest();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArray(5);
        if (arrayUtil.numbers.length == 5) {
            System.out.println("Array size is correct");
        } else {
            System.out.println("Array test failed");
        }
    }

    public void maxNumberTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArray(5);
        arrayUtil.numbers[0] = 4;
        arrayUtil.numbers[1] = 7;
        arrayUtil.numbers[2] = 3;
        arrayUtil.numbers[3] = 4;
        arrayUtil.numbers[4] = 1;
        int maxNumber = arrayUtil.findMaxNumber(arrayUtil.numbers);
        if (maxNumber == 7) {
            System.out.println("Max number test pass");
        } else {
            System.out.println("Max number test fail");
        }
    }

    public void minNumberTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArray(5);
        arrayUtil.numbers[0] = 4;
        arrayUtil.numbers[1] = 7;
        arrayUtil.numbers[2] = 3;
        arrayUtil.numbers[3] = 4;
        arrayUtil.numbers[4] = 1;
        int minNumber = arrayUtil.findMaxNumber(arrayUtil.numbers);
        if (minNumber == 1) {
            System.out.println("Min number test pass");
        } else {
            System.out.println("Min number test fail");
        }
    }
}
