package student_sergei_klunkov.lesson_4.level_4;

class CalculatorTest {


    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.diffTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.threeNumbers();
        calculatorTest.threeNumbers2();
        calculatorTest.threeNumbers3();
        calculatorTest.threeNumbers4();
        calculatorTest.threeNumbers5();

    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }

}

    public void diffTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.difference(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Difference test = OK");
        } else {
            System.out.println("Difference test = FAIL");
        }

    }
    public void multiTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");

}
    }

        public void divTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 2;
            Calculator calculator = new Calculator();
            int realResult = calculator.division(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Division test = OK");
            } else {
                System.out.println("Division test = FAIL");
            }

        }

        public void maxOfTwoNumbersTest1(){
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
            int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
            if (realResult == expectedResult){
                System.out.println("First number is MAX");
            } else {
                System.out.println("First number is NOT MAX");
            }
         }

    public void maxOfTwoNumbersTest2(){
        int firstNumber = 10;
        int secondNumber = 15;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Second number is MAX");
        } else {
            System.out.println("Second number is NOT MAX");
        }
    }

    public void maxOfTwoNumbersTest3(){
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Both numbers are MAX");
        } else {
            System.out.println("Both numbers are NOT MAX");
        }
    }

    public void threeNumbers(){
        int firstNum = 10;
        int secondNum = 4;
        int thirdNum = 7;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectedResult){
            System.out.println("First number are greater then Second and Third number");
        } else {
            System.out.println("First number are NOT greater then Second and Third number");
        }
    }

    public void threeNumbers2(){
        int firstNum = 10;
        int secondNum = 15;
        int thirdNum = 7;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectedResult){
            System.out.println("Second number are greater then First and Third number");
        } else {
            System.out.println("Second number are NOT greater then First and Third number");
        }

    }
    public void threeNumbers3(){
        int firstNum = 10;
        int secondNum = 15;
        int thirdNum = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectedResult){
            System.out.println("Third number are greater then First and Second number");
        } else {
            System.out.println("Third number are NOT greater then First and Second number ");

}
    }
        public void threeNumbers4(){
            int firstNum = 10;
            int secondNum = 10;
            int thirdNum = 5;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
            if (realResult == expectedResult){
                System.out.println("First and Second numbers are equal, but  greater then Third number");
            } else {
                System.out.println("First and Second numbers are equal, but NOT greater then Third number");
            }
        }

    public void threeNumbers5(){
        int firstNum = 10;
        int secondNum = 10;
        int thirdNum = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (realResult == expectedResult){
            System.out.println("First, Second and Third numbers are equal");
        } else {
            System.out.println("First, Second and Third numbers are NOT equal");
        }

    }
}





