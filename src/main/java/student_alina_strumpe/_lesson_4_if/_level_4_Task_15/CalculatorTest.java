package student_alina_strumpe._lesson_4_if._level_4_Task_15;

public class CalculatorTest {

    public static void main(String[] args) {
    }


    public void maxOfThreeTest1() {

        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(5, 2, 1);
        if (realResult == 5) {
            System.out.println("MaxOFThree TEST 1 is OK");
        } else if (realResult == 2) {
            System.out.println("MaxOfThree TEST 1 is FAIL");
        } else {
            System.out.println("MaxOFThree TEST 1 is FAIL");
        }

    }


    public void maxOfThreeTest2() {

        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(5, 10, 8);
        if (realResult == 10) {
            System.out.println("MaxOfThree TEST 2 is OK");
        } else if (realResult == 5) {
            System.out.println("MaxOfThree TEST 2 is FAIL");
        } else {
            System.out.println("MaxOfThree TEST 2 is FAIL");
        }
    }


    public void maxOfThreeTest3() {

        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(5, 10, 20);
        if (realResult == 20) {
            System.out.println("MaxOfThree TEST 3 is OK");
        } else if (realResult == 5) {
            System.out.println("MaxOFThree TEST 3 is FAIL");
        } else {
            System.out.println("MaxOFThree TEST 3 is FAIL");
        }

    }

    public void maxOfThreeTest4() {

        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(20, 20, 1);
        if (realResult == 20) {
            System.out.println("MaxOfThree TEST 4 is OK");
        } else {
            System.out.println("MaxOfThree TEST 4 is FAIL");
        }
    }


    public void maxOfThreeTest5() {

        int expectedResult = 14;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(10, 14, 14);
        if (realResult == 14) {
            System.out.println("MaxOfThree TEST 5 is OK");
        } else {
            System.out.println("MaxOfThree TEST 5 is FAIL");

        }
    }



    public void maxOfThreeTest6(){

        int expectedResult = 10;                // negative testing. My input assume that the value of the second number is always less.
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(21,10,21);
        if (realResult == 10){
            System.out.println("MaxOfThree TEST 6 is OK");
        } else {
            System.out.println("MaxOfThree TEST 6 is FAIL");
        }
    }



    public void maxOfThreeTest7(){
        int expectedResult = 11;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(11,11,11);
        if (realResult == 11){
            System.out.println("MaxOfThree TEST 7 is OK");
        } else {
            System.out.println("MaxOfThree TEST 4 is FAIL");
        }
    }


}
//    Тесты должны покрывать следующие тестовые сценарии:
//        - первое число больше второго и третьего
//        - второе число больше первого и третьего
//        - третье число больше первого и второго
//        - первые два равны и больше третьего
//        - ...
//        - три числа равны
//        По одному тесту на каждый из сценариев!