package student_aleksandra_jefimova.lesson_4.task_10;
import java.util.Scanner;
public class Task_10_PrintBiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number One: ");
        int numberOne = scanner.nextInt();
        System.out.println("Insert number Two: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Insert number Three ");
        int numberThree = scanner.nextInt();
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println(numberOne);}
        if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println(numberTwo);}
        else if (numberThree> numberOne && numberThree > numberTwo)
         {
            System.out.println(numberThree);
        }
    }
}
