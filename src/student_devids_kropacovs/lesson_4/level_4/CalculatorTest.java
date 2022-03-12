package student_devids_kropacovs.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.evenOddTest();
        calculatorTest.maxOfTwoNumTest1();
        calculatorTest.maxOfTwoNumTest2();
        calculatorTest.maxOfTwoNumTest3();
    }

    public void sumTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }

    }

    public void subTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator c = new Calculator();
        int realResult = c.sub(firstNumber,secondNumber);
        if(expectedResult == realResult){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }
    }

    public void multTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator c = new Calculator();
        int realResult = c.mult(firstNumber,secondNumber);
        if(expectedResult == realResult){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }
    }

    public void divTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator c = new Calculator();
        double realResult = c.div(firstNumber,secondNumber);
        if(expectedResult == realResult){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }
    }

    public void evenOddTest(){
        int number1 = 4;
        int number2 = 5;
        boolean expectedReslut1 = true;
        boolean expecteResult2 = false;
        Calculator c = new Calculator();
        if(c.even(number1) == expectedReslut1){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }
        if(c.even(number2) == expecteResult2){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }
    }
    public  void maxOfTwoNumTest1(){
        int number1 = 4;
        int number2 = 5;
        int expectedResult = number2;
        Calculator c = new Calculator();
        int actualResult = c.maxOfTwoNumbers(number1,number2);
        if(actualResult == expectedResult){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }
    }

    public  void maxOfTwoNumTest2(){
        int number1 = 5;
        int number2 = 4;
        int expectedResult = number1;
        Calculator c = new Calculator();
        int actualResult = c.maxOfTwoNumbers(number1,number2);
        if(actualResult == expectedResult){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }
    }

    public  void maxOfTwoNumTest3(){
        int number1 = 5;
        int number2 = 5;
        int expectedResult = number1;
        Calculator c = new Calculator();
        int actualResult = c.maxOfTwoNumbers(number1,number2);
        if(actualResult == expectedResult){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }
    }
}
