package student_stanislav_astafjev.lesson_4.Task_11_12_13_14_15;

class Calculator {
    public int sum(int firstNumber,int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int sub(int firstNumber,int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int division(int firstNumber,int secondNumber) {
        return firstNumber / secondNumber;
    }
    public int Multiplication(int firstNumber,int secondNumber) {
        return firstNumber * secondNumber;
    }
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber,secondNumber);
    }
}
