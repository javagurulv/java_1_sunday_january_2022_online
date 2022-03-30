package student_sergei_klunkov.lesson_5.level_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] actualResult = arrayUtil.createArray(3);
        if (actualResult.length > 0) {
            System.out.println("TEST = PASSED!");
        } else {
            System.out.println("TEST = FAILED!");
        }

    }

    public void shouldFindMaxNumber() {
        // Напишите реализацию !!!
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[3];

        array[0] = 1;
        array[1] = 10;
        array[2] = 5;

        int actualResult = arrayUtil.findMaxNumber(array);
        if(actualResult == array[1]){
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST IS NOT OK!");
        }
    }

    public void shouldFindMinNumber() {
        // Напишите реализацию !!!
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[3];

        array[0] = 6;
        array[1] = 43;
        array[2] = 4;

        int actualResult = arrayUtil.findMaxNumber(array);
        if(actualResult == array[2]){
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST IS NOT OK!");
        }


}

}

