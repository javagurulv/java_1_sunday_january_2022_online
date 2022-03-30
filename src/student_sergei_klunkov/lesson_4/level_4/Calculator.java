package student_sergei_klunkov.lesson_4.level_4;

class  Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int difference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if(number%2==0){
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {

        if (firstNumber>secondNumber){
            return firstNumber;
        }
        if (secondNumber>firstNumber){
            return secondNumber;
        } else {
            return firstNumber;
        }

    }

    public int threeNumbers(int firstNum, int secondNum, int thirdNum){

        if(firstNum > secondNum && firstNum > thirdNum){
            return firstNum;}

        if(secondNum>firstNum && secondNum>thirdNum){
            return secondNum;}

        if(thirdNum>firstNum && thirdNum>secondNum){
            return thirdNum;}

        if(firstNum>thirdNum && secondNum>thirdNum && firstNum==secondNum);
        return firstNum;
    }


}












