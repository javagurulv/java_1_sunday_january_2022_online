package student_anna_zhoydik.lesson_4.task_11_12_13_14_15;

class Calculator {

  public int sum(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }

  public int diff(int firstNumber, int secondNumber) {
    return firstNumber - secondNumber;
  }

  public int div(int firstNumber, int secondNumber) {
    return firstNumber / secondNumber;
  }


  public int multip(int firstNumber, int secondNumber) {
    return firstNumber * secondNumber;
  }

  public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
    if (firstNumber > secondNumber) {
      return firstNumber;
    } else {
      return secondNumber;
    }
  }

}

