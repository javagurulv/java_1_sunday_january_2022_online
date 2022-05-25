package student_alina_strumpe._lesson_4_if._level_1_Task_13;

public class CalculatorDemo {

   public static  void main(String[] args){

        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(10);
        System.out.println(result);

        CalculatorTest object =  new CalculatorTest();
        object.isEvenTest();
        object.isEvenTest2();



    }
}
