package student_alina_strumpe._lesson_4_if._level_4_Task_15;

public class CalculatorDemo {

    public static void main(String[] args){

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(10,10,10);
        System.out.println(result);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.maxOfThreeTest1();
        calculatorTest.maxOfThreeTest2();
        calculatorTest.maxOfThreeTest3();
        calculatorTest.maxOfThreeTest4();
        calculatorTest.maxOfThreeTest5();
        calculatorTest.maxOfThreeTest6();
        calculatorTest.maxOfThreeTest7();


    }
}
