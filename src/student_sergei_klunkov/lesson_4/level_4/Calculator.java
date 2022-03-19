package student_sergei_klunkov.lesson_4.level_4;

class Calculator {

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
        } else {
        if (secondNumber>firstNumber){
            return secondNumber;
        } else {
        if (firstNumber==secondNumber ){
        } return firstNumber;

        }

}
}



}







