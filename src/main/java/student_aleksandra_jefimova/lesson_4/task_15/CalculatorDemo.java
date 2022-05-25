package student_aleksandra_jefimova.lesson_4.task_15;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(10,40, 50);
        System.out.println("Max = "+result);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
    }
}
