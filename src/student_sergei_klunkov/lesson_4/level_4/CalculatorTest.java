package student_sergei_klunkov.lesson_4.level_4;

class CalculatorTest {


    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.diffTest();
        calculatorTest.multiTest();
        calculatorTest.divTest();

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
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.difference(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Difference test = OK");
        } else {
            System.out.println("Difference test = FAIL");
        }

    }
    public void multiTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 50;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");

}
    }

        public void divTest() {
            int firstNumber = 10;  // подготавливаем тестовые данные
            int secondNumber = 5;  // подготавливаем тестовые данные
            int expectedResult = 2;  // подготавливаем тестовые данные
            Calculator calculator = new Calculator();
            int realResult = calculator.division(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                System.out.println("Division test = OK");
            } else {
                System.out.println("Division test = FAIL");
            }

        }
}