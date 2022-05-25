package student_yevgeniy_tolks.lesson_11_interfaces.level_3.task6;

class SumOfTwoTest implements SumOfTwo{

    public static void main(String[] args) {
    SumOfTwoTest sum = new SumOfTwoTest();
    int sumOfFirstAndSecondNumbers= sum.calculate(2,4);
        System.out.println(sumOfFirstAndSecondNumbers);
    }

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
