package student_aleksandra_jefimova.lesson_4.task_8;
import java.util.Scanner;
class Task_8 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insert number One: ");
    int numberOne = scanner.nextInt();
    System.out.println("Insert number Two: ");
    int numberTwo = scanner.nextInt();
    System.out.println("Insert number Three ");
    int numberThree = scanner.nextInt();
    if (numberOne == numberTwo && numberTwo == numberThree) {
        System.out.println("All numbers are equal");
    } else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree) {
        System.out.println("All numbers are different");}
    else {
        System.out.println("Neither all are equal or different");
    }
}

}
