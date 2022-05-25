package student_vitaly_galuzo.lesson_4.level_4;

 class Calculator {


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
        return Math.max(num1, num2);

    }

    public int maxOfThreeNumbers(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else if (num3 > num2 && num3 > num1) {    //a b c
            return num3;
        } else if (num1 == num2 && num1 > num3) {
            return num1;
        } else if (num1 == num3 && num1 > num2) {
            return num1;
        } else if (num2 == num3 && num2 > num1) {
            return num2;
        } else if (num1 == num2 && num2 == num3) {
            return num2;
        } else {
            return num3;
        }
    }
}




