package student_alina_strumpe._lesson_4_if._level_1_Task_11;

public class CalculatorDemo {

    public  static void main(String[] args){

        Calculator numbers = new Calculator();
        int sum = numbers.sum(5,5);
        int deduction = numbers.deduction(5,2);
        int multiplication = numbers.multiplication(4,4);
        int division = numbers.division(10,2);

        System.out.println("Sum: "+sum+"\n"+ "Deduction: "+deduction+"\n"+ "Multiplication: "+ multiplication+
                "\n"+"Division: "+ division);
    }
}
