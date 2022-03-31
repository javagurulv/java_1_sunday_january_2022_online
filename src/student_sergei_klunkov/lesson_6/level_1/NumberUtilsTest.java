package student_sergei_klunkov.lesson_6.level_1;

class NumberUtilsTest {

    public static void main(String[] args) {

        NumberUtils numberUtils = new NumberUtils();

        boolean expectedResult =  true;
        boolean actualResult = numberUtils.isEven(2);

        if(actualResult == expectedResult){
            System.out.println("TESK OK!");
        } else {
            System.out.println("TEST FAIL!");
        }

    }

}
