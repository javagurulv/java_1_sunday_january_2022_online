package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_4_junior.task_11_12;

class Calculator {

    public int sum(int firstNumber,
                   int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int difference(int firstNumber,
                          int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber,
                              int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double division(double firstNumber,
                           double secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(double result) {
        if (result % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber,
                               int secondNumber) {
        if (firstNumber > secondNumber){
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }


}
