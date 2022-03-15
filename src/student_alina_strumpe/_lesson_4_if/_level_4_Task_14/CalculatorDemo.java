package student_alina_strumpe._lesson_4_if._level_4_Task_14;

public class CalculatorDemo {

    public static void main(String[] args){

        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(20,35);
        System.out.println("Max = "+result);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();


    }
}
