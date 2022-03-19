package student_aleksandra_jefimova.lesson_4.task_9;
import java.util.Scanner;
class Task_9_NumbersAreIncreasing {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insert number One: ");
    int numberOne = scanner.nextInt();
    System.out.println("Insert number Two: ");
    int numberTwo = scanner.nextInt();
    System.out.println("Insert number Three ");
    int numberThree = scanner.nextInt();
    if (numberOne < numberTwo && numberTwo <numberThree) {
        System.out.println("increasing");
    } else if (numberOne > numberTwo && numberTwo > numberThree) {
        System.out.println("decreasing");}
    else {
        System.out.println("Neither increasing or decreasing order");
    }
}


}
