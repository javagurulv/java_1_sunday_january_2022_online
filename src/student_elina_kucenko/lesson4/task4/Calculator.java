package student_elina_kucenko.lesson4.task4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int min(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;

    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
//Тесты должны покрывать следующие тестовые сценарии:
//- первое число больше второго и третьего
//- второе число больше первого и третьего
//- третье число больше первого и второго
//- первые два равны и больше третьего
//- ...
//- три числа равны
//По одному тесту на каждый из сценариев!

    public int maxOfThreeNumbers(int firstNum, int secondNum, int thirdNum) {
        if ((firstNum > secondNum && firstNum > thirdNum)||(firstNum == secondNum && firstNum > thirdNum)) {
            return firstNum;
        } else if ((secondNum > firstNum && secondNum > thirdNum)|| (secondNum==thirdNum&&secondNum>firstNum)) {
            return secondNum;
        }else if (thirdNum>firstNum&&firstNum>secondNum) {
            return thirdNum;
        } else if (thirdNum == firstNum&&firstNum==secondNum) {
            return thirdNum;
          }else {
            return thirdNum;
        }

    }
}
