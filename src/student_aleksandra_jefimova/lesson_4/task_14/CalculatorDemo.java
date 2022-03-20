package student_aleksandra_jefimova.lesson_4.task_14;

class CalculatorDemo {
    public static void main(String[] args){

        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(10,40);
        System.out.println("Max = "+result);

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
    }
}
