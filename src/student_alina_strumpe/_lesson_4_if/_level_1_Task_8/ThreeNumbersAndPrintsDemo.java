package student_alina_strumpe._lesson_4_if._level_1_Task_8;

public interface ThreeNumbersAndPrintsDemo {

    public static void main(String[] args){

        ThreeNumbersAndPrints numbers = new ThreeNumbersAndPrints();

        String print = numbers.acceptThreeNumbers(15,20,30);
        System.out.println(print);
    }
}
