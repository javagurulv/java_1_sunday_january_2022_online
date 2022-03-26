package student_anna_zhoydik.lesson_4.task_11_12_13_14_15;

public class CalculatorTest {

  public static void main(String[] args) {
    CalculatorTest calculatorTest = new CalculatorTest();
    calculatorTest.sumTest();
    calculatorTest.diffTest();
    calculatorTest.divTest();
    calculatorTest.multipTest();
    calculatorTest.maxOfTwoNumbersTest();

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
    int realResult = calculator.diff(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
    if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
      System.out.println("Diff test = OK");
    } else {
      System.out.println("Diff test = FAIL");
    }
  }

  public void divTest() {
    int firstNumber = 10;  // подготавливаем тестовые данные
    int secondNumber = 5;  // подготавливаем тестовые данные
    int expectedResult = 2;  // подготавливаем тестовые данные
    Calculator calculator = new Calculator();
    int realResult = calculator.div(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
    if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
      System.out.println("Div test = OK");
    } else {
      System.out.println("Div test = FAIL");
    }
  }

  public void multipTest() {
    int firstNumber = 10;  // подготавливаем тестовые данные
    int secondNumber = 5;  // подготавливаем тестовые данные
    int expectedResult = 50;  // подготавливаем тестовые данные
    Calculator calculator = new Calculator();
    int realResult = calculator.multip(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
    if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
      System.out.println("Multip test = OK");
    } else {
      System.out.println("Multip test = FAIL");
    }
  }

  public void maxOfTwoNumbersTest() {
    Calculator calculator = new Calculator();
    int maxNumber = calculator.maxOfTwoNumbers(5, 6);
    if (maxNumber == 6) {
      System.out.println("MaxOfTwoNumbers = OK");
    } else {
      System.out.println("MaxOfTest = FAIL");
    }
    maxNumber = calculator.maxOfTwoNumbers(7, 1);
    if (maxNumber == 7) {
      System.out.println("MaxOfTest = OK");
    } else {
      System.out.println("MaxOfTest = FAIL");

    }
    maxNumber=calculator.maxOfTwoNumbers(8,8);
    if(maxNumber==8){
      System.out.println("MaxOfTest = OK");
    } else {
      System.out.println("MaxOfTest = FAIL");

    }
  }
}


