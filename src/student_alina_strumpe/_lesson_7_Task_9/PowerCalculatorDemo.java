package student_alina_strumpe._lesson_7_Task_9;

public class PowerCalculatorDemo {

    public static void main(String[] args){

/*        int bNumber = 5;
        int exponent = 5;
        int power =1;
        for(int i=1; i<=exponent; i++){
            power = power * bNumber;
            System.out.println(power);
        }*/

        PowerCalculator power2 = new PowerCalculator();
        int result = power2.powerOfNumbers(5,5);
        power2.printResult(result);
    }
}
