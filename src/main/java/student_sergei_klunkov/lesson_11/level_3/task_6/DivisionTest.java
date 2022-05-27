package student_sergei_klunkov.lesson_11.level_3.task_6;

class DivisionTest implements Division {

    public static void main(String[] args) {
        DivisionTest test = new DivisionTest();
        int divisionOfFirstAndSecondNumber = test.calculate(2,2);
        System.out.println(divisionOfFirstAndSecondNumber);

    }

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;

    }
}
