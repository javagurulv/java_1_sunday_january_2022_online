package student_aleksandra_jefimova.lesson_4.task_11_12;

class CalculatorDemo {

    public static void main(String[] args) {
        Calculator result = new Calculator();
        int sum = result.sum(3,8);
        int deduction = result.deduction(10,2);
        int multiplication = result.multiplication(2,5);
        int division = result.division(10,2);

        System.out.println(sum);
        System.out.println(deduction);
        System.out.println(multiplication);
        System.out.println(division);
    }
}
