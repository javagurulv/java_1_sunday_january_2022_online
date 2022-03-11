package student_vitaly_galuzo.lesson_4.level_4;

public class Calculator {






    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num1;
    }

    public int division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Can't divide by zero!");
        }
        return num1 / num2;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int num1, int num2) {
        return Math.max(num1 , num2);

    }






}




