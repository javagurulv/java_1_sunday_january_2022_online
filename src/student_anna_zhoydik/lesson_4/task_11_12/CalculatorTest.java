package student_anna_zhoydik.lesson_4.task_11_12;

public class CalculatorTest {

  public static void main(String[] args) {
    CalculatorTest calculatorTest = new CalculatorTest();
    calculatorTest.sumTest();
    calculatorTest.diffTest();
    calculatorTest.divTest();
    calculatorTest.multipTest();
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
}
