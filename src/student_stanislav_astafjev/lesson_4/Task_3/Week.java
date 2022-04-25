package student_stanislav_astafjev.lesson_4.Task_3;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1-7: ");
        int number = input.nextInt();
        if (number == 1){
            System.out.println("Monday");
        }
        else if (number == 2){
            System.out.println("Tuesday");
        }
        else if (number == 3){
            System.out.println("Wednesday");
        }
        else if (number == 4){
            System.out.println("Thursday");
        }
        else if (number == 5){
            System.out.println("Friday");
        }
        else if (number == 6){
            System.out.println("Saturday");
        }
        else if (number == 7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Wrong number !");
        }
    }

}
