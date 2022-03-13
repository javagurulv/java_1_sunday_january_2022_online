package student_alina_strumpe._lesson_4_if._level_1_Task_13;

 class CalculatorDemo {

    public static  void main(String[] args){

        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(11);

        CalculatorTest object =  new CalculatorTest();
        boolean result1 = object.isEvenTest();
        boolean result3 = object.isEvenTest2();


        System.out.println("Result: "+result);
        System.out.println("Result2: "+result1);
        System.out.println("Result3: "+result3);
    }
}
