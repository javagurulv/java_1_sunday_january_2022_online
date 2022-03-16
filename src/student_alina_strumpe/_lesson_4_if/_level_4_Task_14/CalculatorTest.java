package student_alina_strumpe._lesson_4_if._level_4_Task_14;


class CalculatorTest {

    public  void main(String[] args){

    }


    public void maxOfTwoNumbersTest1() {

        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(50, 1);
        if (actualResult == 50) {
            System.out.println("MaxTwoNumbers Test 1 is OK ");
        } else {
            System.out.println("MaxTwoNumbers TEST 1 Is FAIL");
        }

    }


    public void maxOfTwoNumbersTest2() {


        int expectedResult = 60;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(30, 60);
        if (actualResult == 60) {
            System.out.println("MaxTwoNumbers TEST 2 is OK");
        } else {
            System.out.println("MaxTwoNumbers TEST 2 is FAIl");
        }

    }


    public void maxOfTwoNumbersTest3() {

        int firstNumber = 100;
        int secNumber = 100;
        int expectedResult = 100;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(100, 100);
        if (actualResult == 100) {
            System.out.println("MaxTwoNumbers TEST 3 is OK");
        } else {
            System.out.println("MaxTwoNumbers TEST 3 is FAIL");
        }

    }
}